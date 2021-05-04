public class complex {
		double real,img;
		
		complex(double r,double i){
			this.real=r;
			this.img=i;
		}
		
		public static complex add(complex c1,complex c2)
		{
			complex obj=new complex(0,0);
			obj.real=c1.real+c2.real;
			obj.img=c1.img+c2.img;
			
			return obj;
		}
		public static void main(String[] args) {
			complex c1= new complex(5,3);
			complex c2=new complex(3,2);
			complex obj=add(c1,c2);
			System.out.printf("Sum ="+obj.real+"+" + obj.img + "i");
		}
}
