package pe.edu.vallegrande.eggs.dto;

public class SaleDTO {
    private Long idSale;  // Campo para el saleId

    // Getter y Setter para saleId
    public Long getidSale() {
        return idSale;
    }

    public void setidSale(Long idSale) {
        this.idSale = idSale;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "SaleDTO{" +
                "idSale=" + idSale +
                '}';
    }

}
