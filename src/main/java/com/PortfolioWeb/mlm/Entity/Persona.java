package com.PortfolioWeb.mlm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;
@Getter @Setter
@Entity
@CrossOrigin(origins = {"https://frontend-2715c.web.app","https://backendmlm.onrender.com"})
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longirud")
    private String nombre;
      
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longirud")
    private String apellido;
      
    @Size(min = 1, max = 50, message = "No cumple con la longirud")
    private String img;
}
