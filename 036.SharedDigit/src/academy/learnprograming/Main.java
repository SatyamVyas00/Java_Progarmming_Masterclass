package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("does 12 & 23 Share a common Number: "+hasSharedDigit(12,23));
        System.out.println("does 9 & 99 Share a common Number: "+hasSharedDigit(9,99));
        System.out.println("does 15 & 55 Share a common Number: "+hasSharedDigit(15,55));
    }

        public static boolean hasSharedDigit(int first,int second)
        {
            if(first < 10 || first > 99 || second < 10 || second > 99)
            {
                return false;
            }
            int fd1 = first%10;
            first = first/10;
            int fd2 = first%10;
            int sd1 = second%10;
            second = second/10;
            int sd2 = second%10;
            if(fd1==sd1 || fd1 == sd2 || fd2 == sd1 || fd2 == sd2)
                return true;
            else
                return false;
        }
}
