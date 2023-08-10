package com.caicai.Tax;

/**
 * 这是一个税收的例子，有两种的薪水，每种薪水的收税方式不一样，计算最后的税后薪水
 * 主程序里只需要输入两种薪水的值，调用函数后要得到最后的值
 * 该例子因为都要计算薪水，通过接口的方法实现
 *
 */
public class Main {
    public static void main(String[] args) {

        Income[] incomes = new Income[]{

                new NormalIncome(10000),
                new Salary(6060)

        };
        System.out.println(totalTax.totalTax(incomes));
    }
}




