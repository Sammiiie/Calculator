
package calculator;

//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
//import java.util.ArrayList;
//import static sun.security.krb5.Confounder.bytes;
/**
 *
 * @author Ejiga Samuel
 */

//Function used to decrpt another users information
public class RSA {
    
  private BigInteger n;
  private BigInteger decrpt; 
  private BigInteger encrpt;

  private int rsabit = 1024;
  public RSA(BigInteger other, BigInteger enc) {
    n = other;
    encrpt = enc;
  }

//  Function booth encrpts and decrpts
  public RSA(int bits) {
    rsabit = bits;
    SecureRandom r = new SecureRandom();
    BigInteger p = new BigInteger("52673");
    BigInteger q = new BigInteger("54559");
    n = p.multiply(q);
//    n = new BigInteger("1166359079");
    BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    encrpt = new BigInteger("205569157");
    while (m.gcd(encrpt).intValue() > 1) {
      encrpt = encrpt.add(new BigInteger("2"));
    }
    encrpt = new BigInteger("205569157");
//    decrpt = new BigInteger("1705962445");
    decrpt = encrpt.modInverse(m);
  }

//  right here we are encrpting the given msg
  public String encrypt(String msg) {
//      System.out.println("Plaintext: " + new BigInteger(msg.getBytes())).modPow(encrpt, n).toString());
    return (new BigInteger(msg.getBytes())).modPow(encrpt, n).toString();
  }

  public  BigInteger encrypt(BigInteger msg) {
    return msg.modPow(encrpt, n);
  }

// Right here we are decrpting our encrpted message
  public  String decrypt(String msg) {
    return new String((new BigInteger(msg)).modPow(decrpt, n).toByteArray());
  }

  /** Decrypt the given cypher msg. */
  public  BigInteger decrypt(BigInteger msg) {
    return msg.modPow(decrpt, n);
  }

  /** Generate a new public and private key set. */
  public  void generateKeys() {
    SecureRandom r = new SecureRandom();
    BigInteger p = new BigInteger("52673");
    BigInteger q = new BigInteger("54559");
    n = p.multiply(q);
//     n = new BigInteger("1166359079");
    BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    encrpt = new BigInteger("205569157");
    while (m.gcd(encrpt).intValue() > 1) {
      encrpt = encrpt.add(new BigInteger("2"));
    }
    decrpt = encrpt.modInverse(m);
//    decrpt = new BigInteger("1705962445");
  }

  
//  public  BigInteger getN() {
//    return n;
//  }
//
//  /** Return the public key. */
//  public  BigInteger getE() {
//    return encrpt;
//  }

  /** Trivial test program. */
  public static void main(String[] args) throws IOException {
    RSA rsa = new RSA(1024);
//    variables to display the used vales
    BigInteger p = new BigInteger("52673");
    BigInteger q = new BigInteger("54559");
    BigInteger n2 = p.multiply(q);
//    BigInteger n2 = new BigInteger("1166359079");
    BigInteger e2 = new BigInteger("205569157");
    BigInteger m2= (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    e2 = new BigInteger("205569157");
    while (m2.gcd(e2).intValue() > 1) {
      e2 = e2.add(new BigInteger("2"));
    }
//    BigInteger 
    BigInteger d2 = e2.modInverse(m2);
    
    String text1 = "big";
    System.out.println("encrpt: " + e2);
    System.out.println("decrpt: " + d2);
    System.out.println("n: " + n2);
    System.out.println("Plaintext: " + text1);
    BigInteger plaintext = new BigInteger(text1.getBytes());

    BigInteger cypher = rsa.encrypt(plaintext);
//    BigInteger cypher = new BigInteger("242399871710717163141833356375161913858195348955521179173961719159158");
    System.out.println("Encrypted Value: " + cypher);
    plaintext = rsa.decrypt(cypher);

    String text2 = new String(plaintext.toByteArray());
    System.out.println("Plaintext: " + text2);
  }
}
