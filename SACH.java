package lab3_bai1;
import java.util.Scanner;
	 class SACH
{
	Scanner input = new Scanner (System.in);
		private 
			String ma, ten, tg;
        	int trang, tap, gia;
        	String loai, nxb; 
        public 
        	void NHAPSACH()
        {
            System.out.print("tac gia la: ");
            tg = input.nextLine();
            System.out.print("loai sach la: ");
            loai = input.nextLine();
            System.out.print("nxb la: ");
            nxb = input.nextLine();
            System.out.print("ma la: ");
            ma = input.nextLine();
            System.out.print("ten sach la: ");
            ten = input.nextLine();
            System.out.print("so trang la: ");
            trang = input.nextInt();
            System.out.print("so tap la: ");
            tap = input.nextInt();
            System.out.print("gia la: ");
            gia = input.nextInt();
        }
        	void INSACH()
        	{
        	 System.out.println("tac gia: " +tg);
                 System.out.println("loai sach: " +loai);
                 System.out.println("nxb: " +nxb);
                 System.out.println("ma: " +ma);
                 System.out.println("ten sach: " +ten);
                 System.out.println("So trang: " +trang);
                 System.out.println("So tap: " +tap);
                 System.out.println("Gia: " +gia);
        	}
}
	class lab3_bai1
	{
		public static void main(String[] args)
		{
			SACH i1 =new SACH(),i2 = new SACH();
			i1.NHAPSACH();
			i2.NHAPSACH();
			
			i1.INSACH();
			i2.INSACH();
		}
	}