package krd.bootcamp.basket_service.basket;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-19T12:48:31-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class BasketMapperImpl implements BasketMapper {

    @Override
    public Basket toBasket(BasketDTO basketDTO) {
        if ( basketDTO == null ) {
            return null;
        }

        Basket basket = new Basket();

        basket.setId( basketDTO.getId() );
        basket.setVersion( basketDTO.getVersion() );
        basket.setCreatedData( basketDTO.getCreatedData() );
        basket.setCreatedBy( basketDTO.getCreatedBy() );
        basket.setLastModifiedData( basketDTO.getLastModifiedData() );
        basket.setLastModifiedBy( basketDTO.getLastModifiedBy() );
        basket.setPaidPrice( basketDTO.getPaidPrice() );
        basket.setFinalizeBasket( basketDTO.getFinalizeBasket() );
        basket.setSupplierId( basketDTO.getSupplierId() );
        basket.setAddressId( basketDTO.getAddressId() );

        return basket;
    }

    @Override
    public BasketDTO toBasketDTO(Basket basket) {
        if ( basket == null ) {
            return null;
        }

        BasketDTO basketDTO = new BasketDTO();

        basketDTO.setId( basket.getId() );
        basketDTO.setVersion( basket.getVersion() );
        basketDTO.setCreatedData( basket.getCreatedData() );
        basketDTO.setCreatedBy( basket.getCreatedBy() );
        basketDTO.setLastModifiedData( basket.getLastModifiedData() );
        basketDTO.setLastModifiedBy( basket.getLastModifiedBy() );
        basketDTO.setPaidPrice( basket.getPaidPrice() );
        basketDTO.setFinalizeBasket( basket.getFinalizeBasket() );
        basketDTO.setSupplierId( basket.getSupplierId() );
        basketDTO.setAddressId( basket.getAddressId() );

        return basketDTO;
    }

    @Override
    public List<Basket> toBaskets(List<BasketDTO> basketDTOS) {
        if ( basketDTOS == null ) {
            return null;
        }

        List<Basket> list = new ArrayList<Basket>( basketDTOS.size() );
        for ( BasketDTO basketDTO : basketDTOS ) {
            list.add( toBasket( basketDTO ) );
        }

        return list;
    }

    @Override
    public List<BasketDTO> toBasketDTOs(List<Basket> baskets) {
        if ( baskets == null ) {
            return null;
        }

        List<BasketDTO> list = new ArrayList<BasketDTO>( baskets.size() );
        for ( Basket basket : baskets ) {
            list.add( toBasketDTO( basket ) );
        }

        return list;
    }
}
