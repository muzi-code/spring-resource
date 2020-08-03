package com.jd.nlp.dev.muzi.spring5.exercise.demo17;


import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService {
    private String name = "Muzi";
    private String well = "开始Spring5的炫酷之旅，(Muzi)书生不读四书五经！";

    public void show() {
        System.out.println(this.name + "\n" + this.well);
    }

    public static ProductService.ProductServiceBuilder builder() {
        return new ProductService.ProductServiceBuilder();
    }

    public ProductService(String name, String well) {
        this.name = name;
        this.well = well;
    }

    public ProductService() {
    }

    public static class ProductServiceBuilder {
        private String name;
        private String well;

        ProductServiceBuilder() {
        }

        public ProductService.ProductServiceBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductService.ProductServiceBuilder well(String well) {
            this.well = well;
            return this;
        }

        public ProductService build() {
            return new ProductService(this.name, this.well);
        }

        public String toString() {
            return "ProductService.ProductServiceBuilder(name=" + this.name + ", well=" + this.well + ")";
        }
    }
}
