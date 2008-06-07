package tr2sql.cozumleyici;

import net.zemberek.yapi.Kelime;
import tr2sql.db.Kolon;
import tr2sql.db.BaglacTipi;

/**
 * dilek
 */
public class KolonBileseni extends CumleBileseni {

    Kolon kolon;
    BaglacTipi onBaglac;

    public KolonBileseni(Kolon kolon, Kelime kelime) {
        this.kolon = kolon;
        this.tip = CumleBilesenTipi.KOLON;
        this.icerik = kelime.icerikStr();
        this.kelime = kelime;
    }

    public void setOnBaglac(BaglacTipi onBaglac) {
        this.onBaglac = onBaglac;
    }

    public Kolon getKolon() {
        return kolon;
    }

    public BaglacTipi getOnBaglac() {
        return onBaglac;
    }
}
