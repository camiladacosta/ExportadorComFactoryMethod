package com.mycompany.exportadorcomfactorymethod.classes;

import com.mycompany.exportadorcomfactorymethod.entity.Produto;
import java.util.function.Function;

class ColunaMd extends AbstractColuna{

    public ColunaMd(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "|";
    }

    @Override
    public String fechar() {
        return "";
    }
    
}
