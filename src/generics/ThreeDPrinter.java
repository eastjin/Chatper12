package generics;


public class ThreeDPrinter<T> {

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    //Object는 최상위 클래스로 모든 것은 Object로 형변환이 가능하다.
    private T material;
}
