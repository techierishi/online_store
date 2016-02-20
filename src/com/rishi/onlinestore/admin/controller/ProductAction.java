package com.rishi.onlinestore.admin.controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import javax.servlet.http.HttpServletRequest;
import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.admin.service.CategoryService;
import com.rishi.onlinestore.admin.service.ProductService;
import com.rishi.onlinestore.lib.DBG;
import com.rishi.onlinestore.model.Category;
import com.rishi.onlinestore.model.Product;
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

public class ProductAction extends ActionSupport implements
        ServletRequestAware {

    private File productImage;
    private String productImageContentType;
    private String productImageFileName;

    private ProductService productService;
    private HttpServletRequest servletRequest;
    private List<Product> productList;
    private List<Category> categoryList;
    private Product product;

    public String productadd() throws Exception {

        String ret = SUCCESS;
        ProductService productService = new ProductService();
        CategoryService categoryService = new CategoryService();
        categoryList = categoryService.getCategoryList();

        if (null != product) {
            String filePath = getServletRequest().getSession().getServletContext().getRealPath("/");
            DBG.d("addproduct", "Server path:" + filePath);
            File fileToCreate = new File(filePath, this.productImageFileName);
            FileUtils.copyFile(this.productImage, fileToCreate);

            product.setProduct_name(this.productImageFileName);
            productService.productAdd(product);
            ret = SUCCESS;
        } else {
            ret = SUCCESS;
        }
        return ret;
    }

    public String productlist() throws Exception {
        String ret = "";
        ProductService productService = new ProductService();
        if (null != productService.getListOfProducts() && !productService.getListOfProducts().isEmpty()) {
            setProductList(productService.getListOfProducts());
            ret = SUCCESS;
        } else {
            ret = SUCCESS;
        }
        return ret;
    }

    /**
     * @return the productService
     */
    public ProductService getProductService() {
        return productService;
    }

    /**
     * @param productService the productService to set
     */
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    /**
     * @return the productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /**
     * @return the categoryList
     */
    public List<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * @param categoryList the categoryList to set
     */
    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;

    }

    /**
     * @return the productImage
     */
    public File getProductImage() {
        return productImage;
    }

    /**
     * @param productImage the productImage to set
     */
    public void setProductImage(File productImage) {
        this.productImage = productImage;
    }

    /**
     * @return the productImageContentType
     */
    public String getProductImageContentType() {
        return productImageContentType;
    }

    /**
     * @param productImageContentType the productImageContentType to set
     */
    public void setProductImageContentType(String productImageContentType) {
        this.productImageContentType = productImageContentType;
    }

    /**
     * @return the productImageFileName
     */
    public String getProductImageFileName() {
        return productImageFileName;
    }

    /**
     * @param productImageFileName the productImageFileName to set
     */
    public void setProductImageFileName(String productImageFileName) {
        this.productImageFileName = productImageFileName;
    }

    /**
     * @return the servletRequest
     */
    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

}
