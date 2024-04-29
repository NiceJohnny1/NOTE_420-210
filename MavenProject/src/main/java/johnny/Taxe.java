package johnny;

public class Taxe {
    public float calculTaxe(float montant, boolean hasProvTaxe, boolean hasFederalTaxe){
        float tauxTaxe = 0;
        if(hasFederalTaxe){
            tauxTaxe += 0.05F;
        }
        if (hasProvTaxe){
            tauxTaxe += 0.0975F;
        }
        return (float) (Math.round(montant * tauxTaxe * 100.0) / 100.0);
    }
}
