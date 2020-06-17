class StingBasics {

    public static void main(String[] args) {

        String str1 = "Kunal";
        String str3 = new String("Kunal");
        String str = new String("Kunal");
        String str2 = "Kunal";
        System.out.println("str1 = "+str1+" address = "+System.identityHashCode(str1));
        System.out.println("str = "+str+" address = "+System.identityHashCode(str));
        System.out.println("str2 = "+str2+" address = "+System.identityHashCode(str2));
        System.out.println("str3 = "+str3+" address = "+System.identityHashCode(str3));

        if(str1.equals(str2)) {
            System.out.println("Same String");
        } else {
            System.out.println("Different.....");
        }
    }
}