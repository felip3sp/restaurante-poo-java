public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestaurante = new Endereco("123456", "Endereço Restaurante Felipe");

        Restaurante restaurante = new Restaurante();
        restaurante.setId(1L);
        restaurante.setNomeFantasia("Restaurante do Felipe");
        restaurante.setCnpj("000.000.0001-11");
        restaurante.setEndereco(enderecoRestaurante);
        System.out.println(restaurante);
    }
}