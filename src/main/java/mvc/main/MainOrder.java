//package mvc.main;
//
//import mvc.configuration.JPAConfig;
//import mvc.entity.*;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import mvc.repository.OrderRepository;
//
//import java.time.LocalDate;
//
//public class MainOrder {
//    static ApplicationContext context = new AnnotationConfigApplicationContext(JPAConfig.class);
//    static OrderRepository orderRepository = (OrderRepository) context.getBean("orderRepository", OrderRepository.class);
//    public static void main(String[] args) {
//        createNewOrder("Fridge",1,80.0,LocalDate.parse("2019-08-25"),
//                "Paul", "21st B Street");
//    }
//        private static OrdersEntity createNewOrder(String ProductName, int Quantity, double UnitPrice,
//                                                   LocalDate Date, String CustomerName, String CustomerAddress){
//        OrdersDetailsEntity ordersDetailsEntity = new OrdersDetailsEntity();
//            ProductEntity.setProductName(ProductName);
//            ordersDetailsEntity.setQuantity(Quantity);
//            ProductEntity.setUnitPrice(UnitPrice);
//
//        OrdersEntity ordersEntity = new OrdersEntity();
//            ordersEntity.setOrderDate(Date);
//            ordersEntity.setCustomerName(CustomerName);
//            ordersEntity.setCustomerAddress(CustomerAddress);
//        ordersEntity.setOrderDetail(ordersDetailsEntity);
//
//        (ordersDetailsEntity).setOrder(ordersEntity);
//        return ordersEntity;
//
//    }
//}