class TestMain{
   public static void main(String args[]){
     String s1 = "Hello";
     String s2 = "Hello";
     String s3 = new String("Hello").intern();
     
     System.out.println("s1 == s2 "+ (s1 == s2));
     System.out.println("s1 == s3 "+(s1 == s3));
     System.out.println("s1.equals(s3) "+(s1.equals(s3)));
   }
}
