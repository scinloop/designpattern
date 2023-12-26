package designpriciples.Five;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author scinloop
 * @Date 2023/12/26 20:56
 */
public class A extends F{
    private int a;
    private B b;// A depends on B依赖关系
//A与C有关联关系
    private List<C> cList;
//A与D有聚合关系,由A创建，但可以独立于A存在
    private D d;
    //A与E有组合关系,由A创建，与A同生共死
    private E e = new E();
    //与F有继承关系





}

