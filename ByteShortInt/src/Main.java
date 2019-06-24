public class Main {

    public static void main(String[] args){
        //int, byte, short and long all deal with whole numbers

        //int has a width of 32
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        int myInt = 409;
        System.out.println(minInt + " " + maxInt);

        //byte has a width of 8
        byte myByteVal = 10;
        byte minByte = -128;
        byte maxByte = 127;

        //short has width of 16
        short myShortVal = 30000;
        short minShortVal = -32768;
        short maxShortVal = 32767;

        //long has width of 64
        long myLongVal = 500000000;


        //expressions are automatically converted to integer
        //byte testByte = (myByteVal/2); //wont complile

        //use casting to fix above issue -> write data type in parans before expressions
        byte testByte = (byte) (myByteVal/2);
        long testLong = (myLongVal * myByteVal + myShortVal + myInt);
        System.out.println("test Long: " + testLong);
    }
}
