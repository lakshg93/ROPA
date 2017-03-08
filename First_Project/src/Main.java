
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        BigDecimal i;// = 0;
        int j = 0;
        int Q;
        BigDecimal[] N;
        BigDecimal num2;// = 5;
        
        BigDecimal A[];
        BigDecimal B[];
        
        BigDecimal sum;
        
        boolean flag;
        
        Scanner scanner = new Scanner(System.in);
        Q = Integer.parseInt( scanner.next() );
        
        N = new BigDecimal[Q];
        A = new BigDecimal[Q];
        B = new BigDecimal[Q];
        
        Long l1;
        Long l2;
        Long l3;
        
        for(j=0;j<Q;j++){
            
            l1 = Long.parseLong(scanner.next());
            l2 = Long.parseLong(scanner.next());
            l3 = Long.parseLong(scanner.next());
            
            N[j] = BigDecimal.valueOf(l1);
            A[j] = BigDecimal.valueOf(l2);
            B[j] = BigDecimal.valueOf(l3);
            
        }
        
        
        ArrayList<BigDecimal> number;
        
        
        for(j=0;j<Q;j++){
            
            number = new ArrayList<BigDecimal>();
            sum = BigDecimal.valueOf(0);

            if( A[j].compareTo(BigDecimal.valueOf(1)) <= 0 && B[j].compareTo(BigDecimal.valueOf(1)) >= 0 )
                number.add(BigDecimal.valueOf(1));
            if( N[j].remainder(BigDecimal.valueOf(2)).compareTo(BigDecimal.valueOf(0)) != 0  && A[j].compareTo(BigDecimal.valueOf(2)) <= 0 && B[j].compareTo(BigDecimal.valueOf(2)) >= 0)
                number.add(BigDecimal.valueOf(2));
            //if(N[j] % 2 != 0 && A[j] <=2 && B[j] >= 2)
                //number.add(2);
            //if(N[j] % 3 != 0 && A[j] <=3 && B[j] >= 3)
            if( N[j].remainder(BigDecimal.valueOf(3)).compareTo(BigDecimal.valueOf(0)) != 0  && A[j].compareTo(BigDecimal.valueOf(3)) <= 0 && B[j].compareTo(BigDecimal.valueOf(3)) >= 0)
                number.add(BigDecimal.valueOf(3));

            
            for(num2 = A[j]; num2.compareTo(B[j]) <= 0 ; num2 = num2.add(BigDecimal.valueOf(1)) ){
                
                flag = false;

                //for( i=2;i<=Math.sqrt(num2);i++){
                BigDecimal sqrtValue = bigSqrt(num2,new MathContext(4,RoundingMode.HALF_UP));
                for( i=BigDecimal.valueOf(2); i.compareTo( sqrtValue )<=0;i = i.add(BigDecimal.valueOf(1)) ){
                    
                    flag = true;

                    if( (  N[j].remainder(i).compareTo(BigDecimal.valueOf(0)) == 0 && num2.remainder(i).compareTo(BigDecimal.valueOf(0)) == 0) || N[j].remainder(num2).compareTo(BigDecimal.valueOf(0)) == 0 ){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    if(num2.compareTo(A[j]) >= 0 && num2.compareTo(B[j])<= 0)
                    number.add(num2);
                } 
            }
            
            for(i=BigDecimal.valueOf(0); i.compareTo(BigDecimal.valueOf(number.size()))<0;i=i.add(BigDecimal.valueOf(1)))
                sum = sum.add( number.get(Integer.valueOf(i.intValue())) );
            System.out.println(sum);
            
            
            //System.out.println(sum.mod(BigInteger.valueOf(1000000007)));
            

        }
    }
    
    public static BigDecimal bigSqrt(BigDecimal squarD, MathContext rootMC)
  {
    // Static constants - perhaps initialize in class Vladimir!
    BigDecimal TWO = new BigDecimal(2);
    double SQRT_10 = 3.162277660168379332;


    // General number and precision checking
    int sign = squarD.signum();
    if(sign == -1)
      throw new ArithmeticException("\nSquare root of a negative number: " + squarD);
    else if(sign == 0)
      return squarD.round(rootMC);

    int prec = rootMC.getPrecision();           // the requested precision
    if(prec == 0)
      throw new IllegalArgumentException("\nMost roots won't have infinite precision = 0");

    // Initial precision is that of double numbers 2^63/2 ~ 4E18
    int BITS = 62;                              // 63-1 an even number of number bits
    int nInit = 16;                             // precision seems 16 to 18 digits
    MathContext nMC = new MathContext(18, RoundingMode.HALF_DOWN);


    // Iteration variables, for the square root x and the reciprocal v
    BigDecimal x = null, e = null;              // initial x:  x0 ~ sqrt()
    BigDecimal v = null, g = null;              // initial v:  v0 = 1/(2*x)

    // Estimate the square root with the foremost 62 bits of squarD
    BigInteger bi = squarD.unscaledValue();     // bi and scale are a tandem
    int biLen = bi.bitLength();
    int shift = Math.max(0, biLen - BITS + (biLen%2 == 0 ? 0 : 1));   // even shift..
    bi = bi.shiftRight(shift);                  // ..floors to 62 or 63 bit BigInteger

    double root = Math.sqrt(bi.doubleValue());
    BigDecimal halfBack = new BigDecimal(BigInteger.ONE.shiftLeft(shift/2));

    int scale = squarD.scale();
    if(scale % 2 == 1)                          // add half scales of the root to odds..
      root *= SQRT_10;                          // 5 -> 2, -5 -> -3 need half a scale more..
    scale = (int)Math.floor(scale/2.);          // ..where 100 -> 10 shifts the scale

    // Initial x - use double root - multiply by halfBack to unshift - set new scale
    x = new BigDecimal(root, nMC);
    x = x.multiply(halfBack, nMC);                          // x0 ~ sqrt()
    if(scale != 0)
      x = x.movePointLeft(scale);

    if(prec < nInit)                 // for prec 15 root x0 must surely be OK
      return x.round(rootMC);        // return small prec roots without iterations

    // Initial v - the reciprocal
    v = BigDecimal.ONE.divide(TWO.multiply(x), nMC);        // v0 = 1/(2*x)


    // Collect iteration precisions beforehand
    ArrayList<Integer> nPrecs = new ArrayList<Integer>();

    assert nInit > 3 : "Never ending loop!";                // assume nInit = 16 <= prec

    // Let m be the exact digits precision in an earlier! loop
    for(int m = prec+1; m > nInit; m = m/2 + (m > 100 ? 1 : 2))
      nPrecs.add(m);


    // The loop of "Square Root by Coupled Newton Iteration" for simpletons
    for(int i = nPrecs.size()-1; i > -1; i--)
    {
      // Increase precision - next iteration supplies n exact digits
      nMC = new MathContext(nPrecs.get(i), (i%2 == 1) ? RoundingMode.HALF_UP :
                                                        RoundingMode.HALF_DOWN);

      // Next x                                                 // e = d - x^2
      e = squarD.subtract(x.multiply(x, nMC), nMC);
      if(i != 0)
        x = x.add(e.multiply(v, nMC));                          // x += e*v     ~ sqrt()
      else
      {
        x = x.add(e.multiply(v, rootMC), rootMC);               // root x is ready!
        break;
      }

      // Next v                                                 // g = 1 - 2*x*v
      g = BigDecimal.ONE.subtract(TWO.multiply(x).multiply(v, nMC));

      v = v.add(g.multiply(v, nMC));                            // v += g*v     ~ 1/2/sqrt()
    }

    return x;                        // return sqrt(squarD) with precision of rootMC
  }
}
