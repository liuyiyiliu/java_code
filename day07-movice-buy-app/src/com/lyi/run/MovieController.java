package com.lyi.run;

import com.lyi.bean.Business;
import com.lyi.bean.Customer;
import com.lyi.bean.Movie;
import com.lyi.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 23:00
 */
public class MovieController {
    /**
     定义系统的数据容器用户存储数据
     1、存储很多用户（客户对象，商家对象）
     */
    public static final List<User>  ALL_USERS = new ArrayList<>();
    /**
     2、存储系统全部商家和其排片信息 。
     商家1 = [p1,p2,p3,...]
     商家2 = [p2,p3,...]
     ...
     电影拍片信息： 商家一定要添加进去 是 一对多的关系 （集合嵌套）
     */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Map<String,List<Double>> MOVIES_SCORE = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

//  定义一个静态的loginUser用来记录当前登录成功的对象
    public static  User loginUser;

//  日期格式静态类
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    public static final Logger LOGGER =  LoggerFactory.getLogger(Movie.class);
    /**
     * 静态代码块优先执行
     */
    static{
        Customer customer = new Customer();
        customer.setLoginName("ly");
        customer.setPassword("123");
        customer.setPhone("17317550462");
        customer.setRealName("刘毅");
        customer.setGender('男');
        customer.setAccountNumber(1000.0);
        ALL_USERS.add(customer);

        Customer customer2 = new Customer();
        customer2.setLoginName("lsb");
        customer2.setPassword("123");
        customer2.setPhone("17317550468");
        customer2.setRealName("卢思冰");
        customer2.setGender('男');
        customer2.setAccountNumber(9999.0);
        ALL_USERS.add(customer2);

        Business business = new Business();
        business.setLoginName("ygb");
        business.setPassword("123");
        business.setPhone("17118765555");
        business.setRealName("严贵宝");
        business.setGender('女');
        business.setAccountNumber(0);
        business.setShopName("圆融国际影城");
        business.setAddress("夏阳街道");
        ALL_USERS.add(business);

        List<Movie> movies = new ArrayList<>();
//                           门店 =【】上架影片
        ALL_MOVIES.put(business,movies);

        Business business2 = new Business();
        business2.setLoginName("qmg");
        business2.setPassword("123");
        business2.setPhone("18761105315");
        business2.setRealName("乔明杠");
        business2.setGender('男');
        business2.setAccountNumber(0);
        business2.setShopName("圆融2国际影城2");
        business2.setAddress("夏阳街道");
        ALL_USERS.add(business2);

        List<Movie> movies2 = new ArrayList<>();
//                         门店   {集合}
        ALL_MOVIES.put(business2,movies2);



    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("===================购票电影系统=======================");
            System.out.println("1.登录");
            System.out.println("2.用户注册");
            System.out.println("3.商家注册");
            System.out.println("请输入你的指定");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
//                    userRegister();
                    break;
                case "3":
                    break;
                default:
                System.out.println("你输入的命令有误");
            }
        }


    }

    /**
     * 用户注册
     */
//    private static void userRegister() {
//        System.out.println("=======注册用户=======");
//        System.out.println("请输入用户名称");
//        String loginName= SYS_SC.nextLine();
//        Customer customer = new Customer();
//        customer.setLoginName(loginName);
//        ALL_USERS.add(customer);
//    }

    /**
     * 登录功能
     */
    private static void login() {
        while (true) {
            System.out.println("========登录界面=======");
            System.out.println("请输入你的账号");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入你的密码");
            String password = SYS_SC.nextLine();

//        根据用户名查询用户对象
            User user = queryUserByLoginName(loginName);
            if (user != null){
                if(user.getPassword().equals(password)) {
                    loginUser = user;
    //            根据用户是客户和商家  跳转不同界面
                    if(user instanceof Customer){
    //                    用户界面
                        showCustomerMain();

                    }else {
    //                    商家界面
                        showBusinessMain();
                    }
                    return;
                }else{
                    System.out.println("你输入的密码有误，请重新输入");
                }
            }else{
                System.out.println("登录名称错误，请确认");
            }
        }


    }

    /**
     * 商家界面
     */
    private static void showBusinessMain() {

        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getRealName() + (loginUser.getGender()=='男'?"先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                   showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                  deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getRealName() +"请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 修改影片
     */
    private static void updateMovie() {

        System.out.println("===============修改影片==============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size() == 0){
            System.out.println("当前商家没有可修改的影片");
            return;
        }

        while (true) {
//        1.让用户选择需要下架的电影名称
            System.out.println("请输入你要修改的电影名称:");
            String movieName = SYS_SC.nextLine();
//        2.查询有没有此部电影
            Movie movie = queryMovieByName(movieName);
            if(movie != null){
                System.out.println("请您输入修改后的片名：");
                String name  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的主演：");
                String actor  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的时长：");
                String time  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票价：");
                String price  = SYS_SC.nextLine();
                System.out.println("请您输入修改后的票数：");
                String leftPicket  = SYS_SC.nextLine(); // 200\n
                while (true) {
                    try {
                        System.out.println("请您输入修改后的开始时间：");
                        String createTime  = SYS_SC.nextLine();
                        //     (String name, String actor,  double time, double price, int leftPicket, Date createTime)
                        movie.setName(name);
                        movie.setActor(actor);
                        movie.setTime(Double.valueOf(time));
                        movie.setPrice(Double.valueOf(price));
                        movie.setLeftPicket(Integer.valueOf(leftPicket));
                        movie.setCreateTime(sdf.parse(createTime));
                        System.out.println("当前店铺已成功修改");
                        showBusinessInfos();
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.error("时间解析无法完成");
                    }
                }


            }else{
                System.out.println("输入的影片不存在");
                System.out.println("是否还要再次修改影片：y/n");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }
    }

    /**
     * 下架影片
     */
    private static void deleteMovie() {
        System.out.println("===============下架影片==============");
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size() == 0){
            System.out.println("当前商家没有可下架的影片");
            return;
        }

        while (true) {
//        1.让用户选择需要下架的电影名称
            System.out.println("请输入你要查看的电影名称:");
            String movieName = SYS_SC.nextLine();
//        2.查询有没有此部电影
            Movie movie = queryMovieByName(movieName);
            if(movie != null){
    //            下架
                movies.remove(movie);
                System.out.println("当前店铺已成功下架:" + movie.getName());
                showBusinessInfos();
                return;
            }else{
                System.out.println("输入的影片不存在");
                System.out.println("是否还要再次删除影片：y/n");
                String command = SYS_SC.nextLine();
                switch (command){
                    case "y":
                        break;
                    default:
                        System.out.println("好的");
                        return;
                }
            }
        }
    }

    /**
     * 通过输入名称查看是否有此片名
     */
    private static Movie queryMovieByName(String movieName) {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 上映影片
     */
    private static void addMovie() {
        System.out.println("=============上架电影信息===================");
//        根据提供商家的对象（map.get(key)），作为map的键 提取商家对应的排片信息Map<business,List<Movies>>
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请您输入新片名：");
        String name  = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time  = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price  = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String leftPicket  = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入开始时间：");
                String createTime  = SYS_SC.nextLine(); //
    //     (String name, String actor,  double time, double price, int leftPicket, Date createTime)
                Movie movie = new Movie(name,actor,Double.valueOf(time),Double.valueOf(price),Integer.valueOf(leftPicket),
                        sdf.parse(createTime));
                movies.add(movie);
                System.out.println("电影上架成功！！！");
                showBusinessInfos();
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析无法完成");
            }
        }

    }

    /**
     * 展示全部排片信息
     */
    private static void showBusinessInfos() {
        System.out.println("=============展示全部商家排片信息===================");
        LOGGER.info(loginUser.getRealName() +"正在查看详情排片信息");
//        根据提供商家的对象（map.get(key)），作为map的键 提取商家对应的排片信息Map<business,List<Movies>>
        Business business = (Business) loginUser;
        System.out.println(business.getShopName()+"\t\t电话:"+ business.getPhone() + "\t\t地址:" +business.getAddress()+
                "\t\t金额" + business.getAccountNumber());
        List<Movie> movies = ALL_MOVIES.get(business);
        if(movies.size()>0){
            System.out.println("片名\t\t\t主演\t\t时长\t\t票价\t\t票价数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor()
                        + "\t\t" + movie.getTime() + "\t\t" + movie.getPrice() + "\t\t" + movie.getLeftPicket()
                        + "\t\t" + sdf.format(movie.getCreateTime()));
               }
        }else{
            System.out.println("当前商家没有排片信息");
        }



    }

    /**
     * 用户界面
     */
    private static void showCustomerMain() {

        while (true) {
            System.out.println("============用户界面===================");
            System.out.println(loginUser.getRealName() + (loginUser.getGender()=='男'? "先生":"女士") + "欢迎您进入系统" +
                    "\t余额：" + loginUser.getAccountNumber());
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                  showAllMovies();
                    break;
                case "2":
//                    queryMovieByName(filmName);
                    break;
                case "3":
                    // 评分功能
                   scoreMovie();
//                    showAllMovies();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 评分
     */
    private static void scoreMovie() {
//     查询当前登录用户购买电影的记录 ，那些电影现在是可以评价的
       Customer customer = (Customer) loginUser;
       Map<String, Boolean> movies = customer.getGetBuyMovies();
       if(movies.size()==0){
           System.out.println("当前用户没有购买记录");
       }
//      买过了 ，看哪些电影是它可以评分的。
        movies.forEach((name,flg)->{
            if(flg){
                System.out.println("此影片无法评价");
            }else{
                System.out.println("请您对：" + name +"进行打分（0-10）：");
                Double score = Double.valueOf(SYS_SC.nextLine());
//                先根据电影名称 拿到评分数据
                List<Double> scores = MOVIES_SCORE.get(name);
                if(scores==null){
//                  第一次评分
                    scores = new ArrayList<>();
                    scores.add(score);
                    MOVIES_SCORE.put(name,scores);
                }else{
                    scores.add(score);
                }
                movies.put(name,true);
            }


        });

//        获取影片

//        当前用户

    }

    /**
     * 购票功能 ALL_USERS<business,List<movie>>
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("===================购票页面==================");
//            1、首先要获得商家 然后通过商家找到对应的影片
        System.out.println("请输入的商家店铺名称");
        String shopName = SYS_SC.nextLine();
        Business business = getBusinessByShopName(shopName);
        if(business != null){
//            2.此商家的全部排片
            List<Movie> movies = ALL_MOVIES.get(business);
            if(movies.size()>0) {
//            3.购买影片
                System.out.println("请你输入购买的电影名称");
                String filmName = SYS_SC.nextLine();
                Movie movie = getMovieBYBusinessAndFilmName(business, filmName);
                if(movie!= null){
                    System.out.println("请你输入购买的数量");
                    String buyNumber = SYS_SC.nextLine();
                    Integer buyNm = Integer.valueOf(buyNumber);
                    if( movie.getLeftPicket()>=buyNm) {
                        Double payPrice = BigDecimal.valueOf(buyNm)
                                .multiply(BigDecimal.valueOf(movie.getPrice()))
                                .doubleValue();
                        if (loginUser.getAccountNumber() >= payPrice) {
                            System.out.println(loginUser.getRealName()+"成功购买了" + buyNm+ "张电影票");
                               loginUser.setAccountNumber(loginUser.getAccountNumber()-payPrice);
                               movie.setLeftPicket(movie.getLeftPicket()-buyNm);
                               business.setAccountNumber(business.getAccountNumber() + payPrice );
                            Customer customer = (Customer) loginUser;
                            // 记录购买电影的信息
                            // 第一个参数是购买的电影，第二个参数是没有评价的标记！
                            customer.getGetBuyMovies().put(movie.getName(), false);
                               return;
                        } else {
                            System.out.println("你的金额不足，无法购买那么票");
                        }
                    }else {
                        System.out.println("你购买的数量超过库存，最多购买:" + buyNm + "张");
                    }

                }else{
                    System.out.println("你输入的电影名称有误");
                }

            }else {
                System.out.println("此商家没有影片上映");
            }
                
            }else{
                System.out.println("店铺已经关门了");
            }
            

    }

    private static Movie getMovieBYBusinessAndFilmName(Business business, String filmName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().contains(filmName)){
                return  movie;
            }
        }
        return null;

    }

    /**
     * 通过店铺名称查询店铺
     * @param shopName
     * @return
     */
    private static Business getBusinessByShopName(String shopName) {
//        获取所有Business的集合
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if(business.getShopName().contains(shopName)){
                return business;
            }
        }
        return null;
    }

    /**
     * 展示所有商家和排片信息
     */
    private static void showAllMovies() {
        System.out.println("=================商家和排片信息================");
        ALL_MOVIES.forEach(((business, movies) -> {
            System.out.println(business.getShopName()+"\t\t电话:"+ business.getPhone() + "\t\t地址:" +business.getAddress());
            System.out.println("\t\t\t片名\t\t\t主演\t\t时长\t\t票价\t\t票价数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t\t\t" + movie.getName() + "\t\t\t" + movie.getActor()
                        + "\t\t" + movie.getTime() + "\t\t" + movie.getPrice() + "\t\t" + movie.getLeftPicket()
                        + "\t\t" + sdf.format(movie.getCreateTime()));
            }
        }));

    }

    private static User queryUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
//            看用户集合里面是否有登录名
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }

        return null;

    }
}
