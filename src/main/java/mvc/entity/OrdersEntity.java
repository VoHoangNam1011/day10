//package mvc.entity;
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.List;
//
//
//@Entity
//@Table(name="order")
//public class OrdersEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "orderDate")
//    private LocalDate orderDate;
//
//    @Column(name = "customerName")
//    private String customerName;
//
//    @Column(name = "customerAddress")
//    private String customerAddress;
//
//    @OneToMany(mappedBy = "order" , fetch = FetchType.EAGER)
//    private OrdersDetailsEntity orderDetail;
//
//    public OrdersEntity(){
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public LocalDate getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(LocalDate orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerAddress() {
//        return customerAddress;
//    }
//
//    public void setCustomerAddress(String customerAddress) {
//        this.customerAddress = customerAddress;
//    }
//
//    public OrdersDetailsEntity getOrderDetail() {
//        return orderDetail;
//    }
//
//    public void setOrderDetail(OrdersDetailsEntity orderDetail) {
//        this.orderDetail = orderDetail;
//    }
//}
