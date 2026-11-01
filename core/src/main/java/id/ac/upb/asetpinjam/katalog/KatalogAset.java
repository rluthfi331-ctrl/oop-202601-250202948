
package id.ac.upb.asetpinjam.katalog;

import java.util.ArrayList;
import java.util.List;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;

/** Katalog aset di memori. */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    /** Mencari aset berdasarkan nama tanpa membedakan huruf besar dan kecil. */
    public List<Aset> cari(String kata) {
        List<Aset> hasil = new ArrayList<>();

        if (kata == null) {
            return hasil;
        }

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())) {
                hasil.add(aset);
            }
        }

        return hasil;
    }

    /** Mencari aset berdasarkan nama dan jenis aset. */
    public List<Aset> cari(String kata, JenisAset jenis) {
        List<Aset> hasil = new ArrayList<>();

        if (kata == null || jenis == null) {
            return hasil;
        }

        for (Aset aset : daftar) {
            if (aset.getNama().toLowerCase().contains(kata.toLowerCase())
                    && aset.getJenis() == jenis) {
                hasil.add(aset);
            }
        }

        return hasil;
    }
}
