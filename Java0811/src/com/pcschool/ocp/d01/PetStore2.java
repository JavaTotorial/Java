package com.pcschool.ocp.d01;

public class PetStore2 {

    public static void main(String[] args) {
        Cat[] cats = {new Cat(), new Cat()};
        Cat.type = "波斯貓";
        cats[0].name = "小花";cats[0].price = 12000;cats[0].age = 2;cats[0].amount = 8;
        cats[1].name = "柯南";cats[1].price = 500;cats[1].age = 7;cats[1].amount = 5;

        int sum = 0;
        for (int i = 0; i < cats.length; i++) {
            System.out.printf("品種: %s 名字: %s 年齡: %d 價格: %,d 數量: %d 小計: %d\n",
                    Cat.type, cats[i].name, cats[i].age, cats[i].price, cats[i].amount, (cats[i].price * cats[i].amount));
            sum += cats[i].price * cats[i].amount;
        }
        System.out.printf("Cat 總資產: %,d\n", sum);
    }
}
