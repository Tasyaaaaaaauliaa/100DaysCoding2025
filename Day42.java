System.out.print("nama karyawan: ");
        String nama = x.nextLine();

        System.out.print("gaji pokok: ");
        double gajiPokok = x.nextDouble();

        System.out.print("tunjangan: ");
        double tunjangan = x.nextDouble();

        double potongan;
        double bonus;

        if (gajiPokok >= 5000000) {
            potongan = gajiPokok * 0.10; 
            bonus = 500000;               
        } else if (gajiPokok >= 3000000) {
            potongan = gajiPokok * 0.05; 
            bonus = 300000;
        } else {
            potongan = gajiPokok * 0.02;  
            bonus = 100000;
        }

        double gajiBersih = gajiPokok + tunjangan + bonus - potongan;

        System.out.println("-----Rncian gaji karyawan-----");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Bonus         : Rp " + bonus);
        System.out.println("Potongan      : Rp " + potongan);
        System.out.println("-----------------------------");
        System.out.println("Gaji Bersih   : Rp " + gajiBersih);
        
    }


    }
    
