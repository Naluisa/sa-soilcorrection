package edu.utfpr.cp.dacom.sa.soilcorrection;

import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente{
    CALCARIO_DOLOMITICO(),
    CALCARIO_CALCITICO(),
    CALCARIO_CONCHA(),
    GESSO_AGRICOLA(),
    HIDROXIDO_CALCIO(),
    CALCARIO_MAGNESIANO();

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

    FonteCalcioMagnesio(
        double teorFonte,
        final Set<NutrienteAdicional> nutrientesAdicionais) {
            this.teorFonte = teorFonte;
            this.nutrientesAdicionais = nutrientesAdicionais;
        }

    @Override
    public double getTeorFonte() {
        return this.teorFonte;
    }

    @Override
    public Set<NutrienteAdicional> getNutrientesAdicionais() {
        return this.nutrientesAdicionais;
    }
    
}