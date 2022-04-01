package studio.thinkground.aroundhub.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import studio.thinkground.aroundhub.data.entity.Product;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    @NotNull
//    @Size(min = 0, max = 8) -> abcdefg
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    @Min(value=500)
    @Max(value=3000000)
    private int productPrice;

    @NotNull
    @Min(value=0)
    @Max(value=9999)
    private int productStock;

    public Product toEntity(){
        return Product.builder()
                .id(productId)
                .name(productName)
                .price(productPrice)
                .stock(productStock)
                .build();
    }

}