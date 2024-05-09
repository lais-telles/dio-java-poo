public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    MINAS_GERAIS ("MG", "Minas Gerais"),
    CEARA ("CE", "Ceara");

    private String nome;
    private String sigla;
    
    private EstadosBrasileiros(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
