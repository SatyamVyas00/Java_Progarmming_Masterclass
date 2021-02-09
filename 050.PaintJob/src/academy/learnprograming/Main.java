package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	System.out.println("getBucketCount(-3.4,2.1,1.5,2): "+getBucketCount(-3.4,2.1,1.5,2));
        System.out.println("getBucketCount(3.4,2.1,1.5,2): "+getBucketCount(3.4,2.1,1.5,2));
        System.out.println("getBucketCount(2.75,3.25,2.5): "+getBucketCount(2.75,3.25,2.5,1));
        System.out.println("");
        System.out.println("getBucketCount(-3.4,2.1,1.5): "+getBucketCount(-3.4,2.1,1.5));
        System.out.println("getBucketCount(3.4,2.1,1.5): "+getBucketCount(3.4,2.1,1.5));
        System.out.println("getBucketCount(7.25,4.3,2.35): "+getBucketCount(7.25,4.3,2.35));
        System.out.println("");
        System.out.println("getBucketCount(3.4,1.5): "+getBucketCount(3.5,1.5));
        System.out.println("getBucketCount(6.26,2.2): "+getBucketCount(6.26,2.2));
        System.out.println("getBucketCount(3.26,0.75): "+getBucketCount(3.26,0.75));
    }

        public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
        {
            if(width <= 0 || height <= 0 || areaPerBucket <= 0  || extraBuckets < 0)
                return -1;

            double area = width*height;

            int bucketReq =(int) Math.ceil(area/areaPerBucket);

            return(bucketReq-extraBuckets);
        }

        public static int getBucketCount(double width, double height, double areaPerBucket)
        {
            if(width <= 0 || height <= 0 || areaPerBucket <= 0 )
                return -1;

            double area = width*height;

            int bucketReq =(int) Math.ceil(area/areaPerBucket);

            return bucketReq;
        }

        public static int getBucketCount(double area,double areaPerBucket)
        {
            if(area <=0 || areaPerBucket <= 0)
                return -1;

            int bucketReq =(int) Math.ceil(area/areaPerBucket);

            return bucketReq;
        }
}
