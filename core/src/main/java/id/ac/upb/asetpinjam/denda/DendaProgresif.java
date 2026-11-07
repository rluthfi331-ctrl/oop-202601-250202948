
package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        long dendaFlat = aset.hitungDenda(hariTerlambat);

        if (hariTerlambat == 0) {
            return 0;
        }

        long tambahan = dendaFlat * hariTerlambat / 30;

        return dendaFlat + tambahan;
    }
}
