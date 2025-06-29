package in.techmafif.backend.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
	
	@Column
	@GeneratedValue
	private UUID id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column(nullable = false)
	private BigDecimal price;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private boolean isNewArrivals;
	
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date createdAt;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		createdAt = new java.util.Date();
		updatedAt = createdAt;
	}
	
	@PreUpdate
	protected void onUpdate() {
		updatedAt = new java.util.Date();
	}
}
