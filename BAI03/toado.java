package BAI03;

public class toado {
private float x;
private float y;

public toado(){
    this.x = 0.0f;
    this.y = 0.0f;
}

public toado(float x, float y){
    this.x = x;
    this.y = y;
}

public float getx(){
    return x;
}
public float gety(){
    return y;
}

public toado add(toado other) {
    float newx = this.x + other.x;
    float newy = this.y + other.y;
    return new toado(newx, newy);
}

public toado reflectx(){
    return new toado(this.x, -this.y);
}

public void intoado(){
    System.out.println("(" + this.x + "," + this.y + ")");
}

}
