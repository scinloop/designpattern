package designpattern.CompositePattern.FactoryPattern;

/**
 * @Author scinloop
 * @Date 2023/12/23 21:24
 */
//工厂模式
//创建型模式，提供了最佳的创建对象的方式
    //创建一个接口
public interface Shape {
    void draw();
}

//创建实现接口的实体类
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside circle::draw() method.");
    }
}

//创建一个工厂，生成基于给定信息的实体类的对象
class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
