package org.example.exception;

public class NumberExceptionTest{
    public static void main(String[] args){
        try {
            int num1 = 10;
            int num2 = 0;
            int div = num1 / num2;
            System.out.println(div);
        } catch (ArithmeticException ae) {
            ae.getMessage();
            System.out.println(ae);
            // throw new ArithmeticException("Denominator should not be zero.");
        } catch(ArrayIndexOutOfBoundsException ie){
            throw new ArrayIndexOutOfBoundsException("Array Index Exception" + ie.getMessage());
        } catch(NullPointerException npe){
            System.out.println("Value should not be null.");
        } catch(NumberFormatException nfe){
            nfe.printStackTrace();
        } catch(Exception e){
            e.getMessage();
            System.out.println(e);
        } finally{
            System.out.println("Exceptions are handles above.");
        }
    }
}
