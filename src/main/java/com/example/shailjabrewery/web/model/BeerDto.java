package com.example.shailjabrewery.web.model;

import java.util.Objects;
import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
public class BeerDto {
	
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
	
	
	public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final BeerDto beerDto = new BeerDto();

        public Builder id(UUID id) {
            beerDto.id = id;
            return this;
        }

        public Builder beerName(String beerName) {
            beerDto.beerName = beerName;
            return this;
        }

        public Builder beerStyle(String beerStyle) {
            beerDto.beerStyle = beerStyle;
            return this;
        }
        
        public Builder upc(Long upc) {
            beerDto.upc = upc;
            return this;
        }

        public BeerDto build() {
            return beerDto;
        }
    }
    
    
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}
	public Long getUpc() {
		return upc;
	}
	public void setUpc(Long upc) {
		this.upc = upc;
	}
	public BeerDto(UUID id, String beerName, String beerStyle, Long upc) {
		super();
		this.id = id;
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.upc = upc;
	}
	public BeerDto() {
		super();
	}
	@Override
	public String toString() {
		return "BeerDto [id=" + id + ", beerName=" + beerName + ", beerStyle=" + beerStyle + ", upc=" + upc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(beerName, beerStyle, id, upc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeerDto other = (BeerDto) obj;
		return Objects.equals(beerName, other.beerName) && Objects.equals(beerStyle, other.beerStyle)
				&& Objects.equals(id, other.id) && Objects.equals(upc, other.upc);
	}
	

	    
	    
	    // Getters and setters for id, beerName, and beerStyle
	}

	


