package com.example.shailjabrewery.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
	private Integer version;
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private Long upc;
	private BigDecimal price;
	private Integer quantityOnHand;

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private BeerDto beerDto = new BeerDto();

		public Builder id(UUID id) {
			beerDto.id = id;
			return this;
		}

		public Builder version(Integer version) {
			beerDto.version = version;
			return this;
		}

		public Builder createdDate(OffsetDateTime createdDate) {
			beerDto.createdDate = createdDate;
			return this;
		}

		public Builder lastModifiedDate(OffsetDateTime lastModifiedDate) {
			beerDto.lastModifiedDate = lastModifiedDate;
			return this;
		}

		public Builder beerName(String beerName) {
			beerDto.beerName = beerName;
			return this;
		}

		public Builder beerStyle(BeerStyleEnum beerStyle) {
			beerDto.beerStyle = beerStyle;
			return this;
		}

		public Builder upc(Long upc) {
			beerDto.upc = upc;
			return this;
		}

		public Builder price(BigDecimal price) {
			beerDto.price = price;
			return this;
		}

		public Builder quantityOnHand(Integer quantityOnHand) {
			beerDto.quantityOnHand = quantityOnHand;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public OffsetDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public OffsetDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getBeerName() {
		return beerName;
	}

	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	public BeerStyleEnum getBeerStyle() {
		return beerStyle;
	}

	public void setBeerStyle(BeerStyleEnum beerStyle) {
		this.beerStyle = beerStyle;
	}

	public Long getUpc() {
		return upc;
	}

	public void setUpc(Long upc) {
		this.upc = upc;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(beerName, beerStyle, createdDate, id, lastModifiedDate, price, quantityOnHand, upc,
				version);
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
		return Objects.equals(beerName, other.beerName) && beerStyle == other.beerStyle
				&& Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
				&& Objects.equals(lastModifiedDate, other.lastModifiedDate) && Objects.equals(price, other.price)
				&& Objects.equals(quantityOnHand, other.quantityOnHand) && Objects.equals(upc, other.upc)
				&& Objects.equals(version, other.version);
	}

	@Override
	public String toString() {
		return "BeerDto [id=" + id + ", version=" + version + ", createdDate=" + createdDate + ", lastModifiedDate="
				+ lastModifiedDate + ", beerName=" + beerName + ", beerStyle=" + beerStyle + ", upc=" + upc + ", price="
				+ price + ", quantityOnHand=" + quantityOnHand + "]";
	}

	
}
