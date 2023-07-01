public class Student {
	String name,stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean isPass;
	
	Student(String name,int classes,String stuNo,Course mat,Course fizik,Course kimya){
		this.name=name;
		this.classes= classes;
		this.stuNo=stuNo;
		this.mat=mat;
		this.fizik=fizik;
		this.kimya=kimya;
		calcAvarage();
		this.isPass=false;
	}
	
	public void addBulExamNote(int mat,int fizik,int kimya) {
		if(mat>=0 && mat<=100) {
			this.mat.note=mat;
		}
		if(fizik>=0 && fizik<=100) {
			this.fizik.note=fizik;
		}
		if(kimya>=0 && kimya<=100) {
			this.kimya.note=kimya;
		}
	}
	public void addBulVerbalNote(int mat,int fizik,int kimya) {
		if(mat>=0 && mat<=100) {
			this.mat.verbalNote=mat;
		}
		if(fizik>=0 && fizik<=100) {
			this.fizik.verbalNote=fizik;
		}
		if(kimya>=0 && kimya<=100) {
			this.kimya.verbalNote=kimya;
		}
	}
	
	public void isPass() {
		if(this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0 || this.mat.verbalNote==0 || this.fizik.verbalNote==0 || this.kimya.verbalNote==0) {
			System.out.println("Notlar tam olarak girilmemis");
		}
		else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Ortalama : " +this.avarage);
			if(this.isPass) {
				System.out.println("Tebrikler Gectiniz. ");
			}
			else {
				
				System.out.println("Uzgunum gecemediniz. ");
			}
		}	
	}
	
	public void calcAvarage() {
		this.avarage=((this.fizik.verbalNote*0.2+this.fizik.note*0.8)+(this.mat.verbalNote*0.3+this.mat.note*0.7)+(this.kimya.verbalNote*0.1+this.kimya.note*0.9))/3;
	}
	
	  public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	   public void printNote(){
	        System.out.println("=========================");
	        System.out.println("Ogrenci : " + this.name);
	        System.out.println("Matematik Sinav Notu : " + this.mat.note + "\nMatematik Sozlu Notu : "+this.mat.verbalNote);
	        System.out.println("Fizik Sinav Notu : " + this.fizik.note +"\nFizik Sozlu Notu : "+this.fizik.verbalNote);
	        System.out.println("Kimya Sinav Notu : " + this.kimya.note+ "\nKimya Sozlu Notu : "+this.kimya.verbalNote);
	    }
}



































