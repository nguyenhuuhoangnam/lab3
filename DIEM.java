package lab3_bai2;
import java.util.Scanner;
import java.lang.Math;
class DIEM{
	int x,y;	
	public void NHAPTOADO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap toa do x: ");
		x = sc.nextInt();
		System.out.println("nhap toa do y: ");
		y = sc.nextInt();
	}
	protected void diem(int td_x,int td_y)
	{
		x = td_x;
		y = td_y;		
	}	
	public void INTOADO() {
		System.out.println("toa do x: "+x);
		System.out.println("toa do y: "+y);	
	}		
}
class TamGiac extends DIEM{
	DIEM A = new DIEM();
	DIEM B = new DIEM();
	DIEM C = new DIEM();	
	public void NHAPTG() {
		System.out.println("\nnhap toa do A: ");A.NHAPTOADO();
		System.out.println("\nnhap toa do B: ");B.NHAPTOADO();
		System.out.println("\nnhap toa do C: ");C.NHAPTOADO();
	}	
	public void INTAMGIAC() {
		System.out.println("\ntoa do A : ");A.INTOADO();
		System.out.println("\ntoa do B : ");B.INTOADO();
		System.out.println("\\ntoa do C : ");C.INTOADO();	
	}	 
    public void KIEMTRA() {
        if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y)
        {
            double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
            double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
            double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
            if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {    
                System.out.println("3 diem la dinh tg");
            }
            else System.out.println("3 ko la dinh tg");
        }         
    }
    public void CV(){
    	if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
                double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
                double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
                double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
    	    double CV = ab+bc+ca;	
                if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
                    System.out.println("\nCV tam giác : "+CV);
                }
                else System.out.println("\nko tinh dc CV");
            }
    }
    public void stg(){
    	if (A.x != B.x || A.x != C.x || B.x != C.x || A.y != B.y || A.y != C.y || B.y != C.y) {
                double ab = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
                double bc = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
                double ca = Math.sqrt(Math.pow(A.x - C.x, 2) + Math.pow(A.y - C.y, 2));
                double p = (ab + bc + ca)/2;
                double S = Math.sqrt(p*(p-ab)*(p - bc)*( p - ca));
                if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
                    System.out.println("\nstg : "+S);
                }
                else System.out.println("\nko tinh dc stg");
            } 	
    }
}
//Đường tròn
class Circle extends DIEM{
	double r;
	DIEM TAM = new DIEM();	
	public void NHAPCIRCLE(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập bán kính đường tròn : ");
		r = sc.nextFloat();
		System.out.println("\nNhập tọa độ tâm đường tròn : ");
		TAM.NHAPTOADO();
	}	
	public void InDuongTron() {
		System.out.println("\nBán kính đường tròn : "+r);
		System.out.println("\nTọa độ tâm : ");
		TAM.INTOADO();
	}	
	public double ChuVi() {
		return Math.PI * 2 * r; 
	}	
	public double DienTich() {
		return Math.PI * Math.pow(r, 2);		
	}
}
public class lab3_bai2 
{
	public static void main(String[] args) 
	{
		TamGiac tG = new TamGiac();
		tG.NHAPTG();
		tG.INTAMGIAC();
		tG.CV();
		tG.stg();
		System.out.println("\nKiểm tra tam giác :");
		tG.KIEMTRA();
		Circle dT = new Circle();
		dT.NHAPCIRCLE();
		dT.InDuongTron();	
		System.out.println("\nchu vi circle : "+dT.ChuVi());
		System.out.println("\nS circle : "+dT.DienTich());
	}
}