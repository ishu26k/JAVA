
class Area{
void findarea(int x,int y)
{
int f = x*y;
System.out.print("\nArea of triangle : "+f);
}
void findarea(float x)
{
float f = 3.14f*x*x; System.out.print("\nArea of Circle : "+f);
}
void findarea(int x)
{
int f = x*x;
System.out.print("\nArea of Square : "+f);
}
}
class q3{
public static void main(String[] args)
{
Area obj = new Area(); obj.findarea(2); obj.findarea(3.0f); obj.findarea(7,8);

}}