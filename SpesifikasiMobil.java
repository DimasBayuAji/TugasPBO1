public class SpesifikasiMobil{
	public static void main (String[]args){
		Mobil mylist = new Mobil();
		mylist.setNoPol(" D 2368 VCS");
		mylist.setNaPem(" Dimas");
		mylist.setMerk(" Toyota");
		mylist.setType(" Supra");
		mylist.setKapMes(2500);
		mylist.setBerat(3000);
		mylist.setPanjang(300);
		mylist.setLebar(1500);
		mylist.setTahun(2000);
		mylist.setHarga(1000000000);
		String nopol = mylist.getNoPol();
		String napem = mylist.getNaPem();
		String merk = mylist.getMerk();
		String type = mylist.getType();
		System.out.println(" Nomor Polisi\t: "+nopol);
		System.out.println(" Nama Pemilik\t: "+napem);
		System.out.println(" Merk\t\t: "+merk);
		System.out.println(" Type\t\t: "+type);
	}
}