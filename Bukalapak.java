/*
 * 
 * @author (Deden Muhamad Furqon)
 * @version (16/4/2019)
 * 
*/
import java.util.*;

public class Bukalapak{
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		System.out.print("Masukan Id : ");
		int id = in.nextInt();
		in.nextLine();
		System.out.print("Masukan Nama Barang : ");
		String nama = in.nextLine();
		System.out.print("Masukan Merk : ");
		String merk = in.nextLine();
		System.out.print("Masukan Harga : ");
		int harga = in.nextInt();
		in.nextLine();
		System.out.print("Masukan Kondisi : ");
		String kondisi = in.nextLine();
		System.out.print("Masukan Berat : ");
		int berat = in.nextInt();
		System.out.print("Masukan Stock : ");
		int stock = in.nextInt();
		in.nextLine();
		System.out.print("Masukan Kategori : ");
		String kategori = in.nextLine();
		System.out.print("Masukan Sub Kategori : ");
		String subkategori = in.nextLine();
		System.out.print("Masukan Child Kategori : ");
		String childkategori = in.nextLine();
		System.out.print("Masukan Type : ");
		String type = in.nextLine();
		System.out.print("Masukan RAM : ");
		int ram = in.nextInt();
		in.nextLine();
		System.out.print("Masukan Processor : ");
		String processor = in.nextLine();
		System.out.print("Masukan VGA : ");
		String vga = in.nextLine();

		Barang barang = new Barang(id, nama, merk, harga, kondisi, berat, stock,
		 kategori, subkategori, childkategori);
		
		Laptop laptop = new Laptop(id, nama, merk, harga, kondisi, berat, stock,
				 kategori, subkategori, childkategori, type, ram, processor, vga);

		System.out.println();
		System.out.println("========= BUKALAPAK =========");
		System.out.println();
		System.out.println();
		laptop.deskripsi();
		System.out.println("id = " + barang.getId());
		System.out.println("Nama Barang = " + barang.getNama());
		System.out.println("Merk = " + barang.getMerk());
		System.out.println("Harga = " + barang.getHarga());
		System.out.println("Kondisi = " + barang.getKondisi());
		System.out.println("Berat = " + barang.getBerat() + " gram");
		System.out.println("Stock = " + barang.getStock());
		System.out.println("Kategori = " + barang.getKategori());
		System.out.println("Sub Kategori = " + barang.getSubkategori());
		System.out.println("Type = " + laptop.getType());
		System.out.println("RAM = " + laptop.getRam());
		System.out.println("Processor = " + laptop.getProcessor());
		System.out.println("VGA = " + laptop.getVga());
		
		
		System.out.println("Spesifikasi :");
		laptop.spesifikasi(ram, processor, vga);


	}
}