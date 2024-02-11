package com.driver;

public class Main {

    public static void main(String[] args){
        Product p = new Product();
        int ans = p.product(50,20);
        int ans2 = p.product(50,20,10);
        double ans3 = p.product(5.555, 6.6666);

        System.out.print(ans+" "+ ans2+" "+ans3);
    }

    static class Product{

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }
}