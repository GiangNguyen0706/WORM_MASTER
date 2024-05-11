package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class infor extends AppCompatActivity {
    TextView fruitinfor;
    ImageView research_img;
    TextView text_information;
    public static final String KEY_SHOW_WHAT = "";
    public static final String VALUE_APHIDS  = "Aphids";
    public static final String VALUE_THRIPS = "Thrips";
    public static final String VALUE_WHITEFLIES = "Whiteflies";
    public static final String VALUE_ARMYWORM = "Army worm";
    public static final String VALUE_GRUB = "Grub";
    public static final String VALUE_PEACHBORER = "Peach borer";
    public static final String VALUE_BLACKCUTWORM = "Black cutworm";
    public static final String VALUE_LOCUST = "Locust";
    public static final String VALUE_LADYBUG = "Ladybug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);
        fruitinfor = findViewById(R.id.fruitinfor);
        research_img = findViewById(R.id.researchimg);
        text_information = findViewById(R.id.textView3);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String valueShow = bundle.getString(KEY_SHOW_WHAT, "");
            //Toast.makeText(this, "Show value: " + valueShow, Toast.LENGTH_SHORT).show();
            switch (valueShow) {
                case "Aphids":
                    fruitinfor.setText("Con rệp");
                    research_img.setImageResource(R.drawable.aphids);
                    text_information.setText("Aphids là một loại côn trùng nhỏ kích thước, thường gây hại cho các loại cây trồng bằng cách hút chất dinh dưỡng từ lá và phần thân cây." +
                            " \nĐặc điểm của Aphids:\n" +
                            "\n" +
                            "Kích thước nhỏ, thường chỉ khoảng 1-10mm.\n" +
                            "Thân hình mềm mại, thường màu xanh lá cây hoặc hồng nhạt.\n" +
                            "Sinh sống thành đàn sống trên các mảng cây trồng." +
                            "\nCách diệt trừ Aphids:\n" +
                            "Phun thuốc sâu: Sử dụng thuốc sâu có chứa các hoạt chất như pyrethroids, neonicotinoids, hoặc horticultural oils để tiêu diệt Aphids. Tuy nhiên, cần tuân thủ hướng dẫn sử dụng và an toàn khi sử dụng hóa chất.\n" +
                            "Sử dụng loài côn trùng cắn lưỡi: Một số loài côn trùng như ladybugs (bọ rùa) và lacewings (bọ cánh rủ) là kẻ săn mồi tự nhiên của Aphids. Việc thúc đẩy sự hiện diện của chúng có thể giúp kiểm soát dân số của Aphids một cách tự nhiên.\n" +
                            "Rửa bằng nước: Dùng nước để rửa sạch Aphids khỏi cây trồng. Điều này có thể được thực hiện bằng cách sử dụng vòi nước với áp lực nhẹ.\n" +
                            "Sử dụng hóa chất tự nhiên: Một số loại hóa chất tự nhiên như dung dịch cay (ví dụ như dung dịch cayenne pepper) hoặc dung dịch xà phòng có thể được sử dụng để tiêu diệt Aphids mà không gây hại cho môi trường hoặc con người.");
                    return;
                case "Thrips":
                    fruitinfor.setText("Bọ trĩ");
                    research_img.setImageResource(R.drawable.thrips);
                    text_information.setText("Thrips là một loại côn trùng nhỏ kích thước, thường gây hại cho cây trồng bằng cách hút chất dinh dưỡng từ lá, hoa và quả cây" +
                            " \nĐặc điểm của Thrips:\n" +
                            "\n" +
                            "Côn trùng nhỏ, thường có kích thước từ 1 đến 2mm.\n" +
                            "Thân hình dài và mảnh mai, màu sắc thường đa dạng từ màu nâu đến màu đen hoặc màu trắng.\n" +
                            "Sinh sống ở các phần nhỏ của cây như đỉnh non, hoa và lá." +
                            "\nCách diệt trừ Thrips:\n" +
                            "Phun thuốc sâu: Sử dụng thuốc sâu có chứa các hoạt chất như spinosad, neonicotinoids hoặc pyrethroids để tiêu diệt Thrips. Cần chú ý lựa chọn loại thuốc phù hợp với loại cây trồng và tuân thủ hướng dẫn sử dụng.\n" +
                            "Sử dụng hóa chất tự nhiên: Một số loại hóa chất tự nhiên như dung dịch cay, dung dịch neem oil hoặc dung dịch garlic oil cũng có thể được sử dụng để kiểm soát Thrips mà không gây hại cho môi trường hoặc con người.\n" +
                            "Cắt bỏ và tiêu diệt: Loại bỏ các phần cây bị nhiễm sâu bệnh và tiêu diệt chúng có thể là một cách hiệu quả để ngăn chặn sự lây lan của Thrips.\n" +
                            "Sử dụng mồi cám: Sử dụng mồi cám như mồi dính trên cây trồng để thu hút và hạ gục Thrips.");
                case "Whiteflies":
                    fruitinfor.setText("Ruồi trắng");
                    research_img.setImageResource(R.drawable.whiteflies);
                    text_information.setText("Whiteflies là một loại côn trùng nhỏ thuộc họ Aleyrodidae, chúng gây ra nhiều vấn đề cho cây trồng bằng cách hút chất dinh dưỡng từ lá cây và truyền nhiều loại vi khuẩn và virus gây bệnh. Các loại cây trồng chịu tổn thất nặng do whiteflies bao gồm cà chua, bí ngô, cà rốt, bí đỏ, dưa chuột và nhiều loại cây hoa khác." +
                            " \nĐặc điểm của Whiteflies:\n" +
                            "\n" +
                            "Côn trùng nhỏ, thường có kích thước từ 1 đến 2mm.\n" +
                            "Thân hình dài và mảnh mai, màu sắc thường đa dạng từ màu nâu đến màu đen hoặc màu trắng.\n" +
                            "Sinh sống ở các phần nhỏ của cây như đỉnh non, hoa và lá." +
                            "\nCách diệt trừ Whiteflies:\n" +
                            "Sử dụng thuốc trừ sâu: Các loại thuốc trừ sâu có thể được sử dụng để kiểm soát whiteflies. Tuy nhiên, cần lưu ý rằng sử dụng thuốc trừ sâu có thể gây hại cho môi trường và sức khỏe con người, nên cần tuân thủ hướng dẫn sử dụng cẩn thận.\n" +
                            "Sử dụng cây trồng kháng ký sinh: Một số loại cây trồng có khả năng sản sinh các hợp chất có thể làm đau loài whiteflies hoặc ngăn chúng phát triển.\n" +
                            "Làm sạch môi trường: Loại bỏ các lá cây bị nhiễm bệnh hoặc lãng phí cây trồng có thể giảm bớt sự lây lan của whiteflies.");
                    return;
                case "Army worm":
                    fruitinfor.setText("Sâu keo");
                    research_img.setImageResource(R.drawable.army);
                    text_information.setText("\"Armyworm\"Loài sâu này thường gây ra thiệt hại nghiêm trọng cho cây trồng, do chúng ăn lá, thân, hoặc cả hạt của cây" +
                            " \nĐặc điểm của Armyworm:\n" +
                            "\n" +
                            "Các sâu này thường có thói quen di cư theo nhóm lớn, gây ra sự tàn phá trên diện rộng trong các vùng trồng trọt.\n" +
                            "Màu sắc của chúng có thể thay đổi, từ xanh đến nâu, với dải sọc trắng hoặc đỏ dọc theo thân.\n" +
                            "\nCách diệt trừ Armyworm:\n" +
                            "Phun thuốc sâu: Sử dụng thuốc sâu có chứa các hoạt chất như carbaryl, malathion, permethrin hoặc bacillus thuringiensis (Bt) để tiêu diệt sâu Armyworm. Hãy tuân thủ hướng dẫn sử dụng cẩn thận để đảm bảo an toàn cho cây trồng và môi trường.\n" +
                            "Kiểm tra định kỳ: Theo dõi sự xuất hiện của sâu Armyworm trên cây trồng và thực hiện các biện pháp kiểm soát kịp thời nếu cần thiết.\n" +
                            "Sử dụng thuốc diệt cỏ: Một số loại thuốc diệt cỏ có thể được sử dụng để kiểm soát sâu Armyworm, vì chúng thường thích ẩn náu ở dưới các cỏ dại.\n" +
                            "Thúc đẩy sự xuất hiện của kẻ thù tự nhiên: Một số loại côn trùng khác như ladybugs, lacewings và parasitic wasps có thể là kẻ săn mồi tự nhiên của sâu Armyworm. Tạo điều kiện thúc đẩy sự xuất hiện của chúng có thể giúp kiểm soát dân số sâu Armyworm một cách tự nhiên.");
                    return;
                case "Grub":
                    fruitinfor.setText("Ấu trùng bọ cánh cứng");
                    research_img.setImageResource(R.drawable.grub);
                    text_information.setText("Grub là một thuật ngữ thông dụng để chỉ giai đoạn ấu trùng của các loài bọ cánh cứng thuộc họ Scarabaeidae, như larva của bọ cánh cứng đất " +
                            " \nĐặc điểm của Grub:\n" +
                            "\n" +
                            "Grub là giai đoạn ấu trùng của một số loài bọ cánh cứng.\n" +
                            "Thường sống dưới lòng đất, ăn rễ cây hoặc vật chất hữu cơ.\n" +
                            "Chúng có thể có hình dạng và màu sắc khác nhau, tùy thuộc vào loài.\n" +
                            "\nCách diệt trừ Grub:\n" +
                            "Sử dụng nematodes có hại cho sâu bọ: Nematodes là loại động vật nhỏ sống trong đất và là kẻ săn mồi tự nhiên của grub. Sử dụng nematodes được mua từ cửa hàng cung cấp các loại thuốc diệt cỏ và côn trùng có thể giúp kiểm soát grub một cách hiệu quả.\n" +
                            "Phun thuốc diệt cỏ và côn trùng: Sử dụng thuốc diệt cỏ hoặc thuốc diệt côn trùng có chứa các hoạt chất như imidacloprid, chlorantraniliprole, thiamethoxam, clothianidin, hoặc bifenthrin để kiểm soát grub. Tuy nhiên, cần phải tuân thủ hướng dẫn sử dụng cẩn thận để đảm bảo an toàn cho môi trường và con người.\n" +
                            "Kiểm tra và tiêu diệt bằng tay: Nếu phát hiện grub trong đất, bạn có thể tiêu diệt chúng bằng cách thu thập và tiêu hủy bằng tay.\n" +
                            "Kiểm soát cỏ dại: Các loại cỏ dại có thể là nơi ẩn náu của grub. Việc kiểm soát cỏ dại có thể giúp giảm sự xuất hiện của grub trong khu vực trồng cây.");
                    return;
                case "Peach borer":
                    fruitinfor.setText("Sâu đục gỗ");
                    research_img.setImageResource(R.drawable.borer);
                    text_information.setText("\n" +
                            "Peach borer là một loại sâu bệnh gây hại cho cây đào (peach) và một số cây trồng khác thuộc họ Rosaceae như lúa mạch, cây hồng (rose), và cây táo (apple)." +
                            " \nĐặc điểm của Peach borer:\n" +
                            "\n" +
                            "Peach borer là larva của một số loài bướm có kích thước nhỏ, thường dài từ 1 đến 2 inch (khoảng 2.5 đến 5 cm).\n" +
                            "Chúng có thể có màu trắng hoặc màu nâu đậm, và thường sống dưới vỏ cây hoặc trong thân cây.\n" +
                            "Sâu Peach borer gây ra thiệt hại chủ yếu bằng cách ăn lá cây, rễ và phần nội của cây.\n" +
                            "\nCách diệt trừ Peach borer:\n" +
                            "Kiểm tra và loại bỏ: Thực hiện kiểm tra định kỳ trên cây trồng để phát hiện sớm sự hiện diện của sâu Peach borer. Nếu phát hiện, bạn có thể loại bỏ chúng bằng cách cẩn thận cắt hoặc phá hủy phần cây bị nhiễm sâu.\n" +
                            "Sử dụng thuốc diệt cỏ và côn trùng: Sử dụng thuốc diệt cỏ và côn trùng có chứa các hoạt chất như permethrin, bifenthrin, cyfluthrin, hoặc carbaryl để kiểm soát sâu Peach borer. Hãy tuân thủ hướng dẫn sử dụng và an toàn của sản phẩm.\n" +
                            "Sử dụng hóa chất sinh học: Các sản phẩm chứa Bacillus thuringiensis (Bt), một loại vi khuẩn tự nhiên có khả năng giết sâu, cũng có thể được sử dụng để kiểm soát sâu Peach borer mà không gây hại cho môi trường và con người.\n" +
                            "Kiểm soát cỏ dại: Loại bỏ cỏ dại xung quanh cây trồng có thể giúp giảm sự xuất hiện của sâu Peach borer, bởi vì chúng thích ẩn náu trong môi trường này.");
                    return;
                case "Black cutworm":
                    fruitinfor.setText("Sâu đen cắt đốt");
                    research_img.setImageResource(R.drawable.cutworm);
                    text_information.setText("\n" +
                            "Black cutworm, hay còn gọi là sâu đen cắt đốt, là một loài sâu gây hại cho nhiều loại cây trồng, bao gồm lúa, ngô, cải, và các loại cỏ khác. " +
                            " \nĐặc điểm của Black cutworm:\n" +
                            "\n" +
                            "Sâu đen cắt đốt có màu đen hoặc nâu đậm, thân hình mập mạp và dài khoảng 1-2 inches (khoảng 2.5 - 5 cm).\n" +
                            "Chúng thường sống dưới lòng đất trong ban ngày và hoạt động vào ban đêm.\n" +
                            "Sâu đen cắt đốt gây thiệt hại chủ yếu bằng cách ăn lá cây, gốc cây hoặc thân cây.\n" +
                            "\nCách diệt trừ Black cutworm:\n" +
                            "Kiểm tra và loại bỏ: Thực hiện kiểm tra định kỳ trên cây trồng để phát hiện sớm sự hiện diện của sâu đen cắt đốt. Nếu phát hiện, bạn có thể loại bỏ chúng bằng cách thu thập và tiêu diệt bằng tay.\n" +
                            "Sử dụng thuốc diệt cỏ và côn trùng: Sử dụng thuốc diệt cỏ và côn trùng có chứa các hoạt chất như chlorpyrifos, carbaryl, bifenthrin, hoặc cyfluthrin để kiểm soát sâu đen cắt đốt. Hãy tuân thủ hướng dẫn sử dụng và an toàn của sản phẩm.\n" +
                            "Sử dụng phương pháp sinh học: Một số loại kẻ thù tự nhiên của sâu đen cắt đốt như côn trùng cánh cứng, bọ rùa và bọ cánh rủ có thể được sử dụng để kiểm soát sâu một cách tự nhiên.\n" +
                            "Kiểm soát cỏ dại: Loại bỏ cỏ dại xung quanh cây trồng có thể giúp giảm sự xuất hiện của sâu đen cắt đốt, bởi vì chúng thích ẩn náu trong môi trường này.");
                    return;
                case "Locust":
                    fruitinfor.setText("Châu chấu");
                    research_img.setImageResource(R.drawable.locust);
                    text_information.setText("Châu chấu là loài côn trùng thuộc họ Acrididae và là một phần không thể thiếu của hệ sinh thái, thường sống trong các môi trường đồng cỏ, bãi cỏ và đồng ruộng trên khắp thế giới." +
                            " \nĐặc điểm của Locust:\n" +
                            "Châu chấu thường có thân hình mảnh mai, chân dài và cánh mạnh mẽ.\n" +
                            "Chúng có thể di chuyển nhanh chóng bằng cách nhảy và bay, và có thể làm điều đó trong khoảng thời gian dài.\n" +
                            "Châu chấu thường ăn cỏ, lá cây và thậm chí là các loài cây trồng, gây ra thiệt hại cho nông nghiệp và môi trường tự nhiên.\n" +
                            "\nCách diệt trừ Locust:\n" +
                            "Sử dụng thuốc diệt côn trùng: Phun thuốc diệt côn trùng có chứa các hoạt chất như malathion, permethrin hoặc carbaryl để kiểm soát châu chấu. Tuy nhiên, việc sử dụng thuốc cần tuân thủ hướng dẫn sử dụng cẩn thận để đảm bảo an toàn cho môi trường và con người.\n" +
                            "Sử dụng phương pháp sinh học: Một số loại vi khuẩn, virus và nấm có thể được sử dụng để kiểm soát châu chấu một cách tự nhiên mà không gây hại cho môi trường.\n" +
                            "Sử dụng phương pháp tiên tiến: Sử dụng hệ thống giám sát và dự báo để theo dõi di chuyển của châu chấu và triển khai biện pháp kiểm soát kịp thời.\n" +
                            "Kiểm soát môi trường sống: Giảm bớt môi trường sống của châu chấu bằng cách loại bỏ cỏ dại và môi trường sống khác có thể giúp giảm sự xuất hiện của chúng.");
                    return;
                case "Ladybug":
                    fruitinfor.setText("Bọ rùa");
                    research_img.setImageResource(R.drawable.ladybug);
                    text_information.setText("\n" + "Bọ rùa là một loại côn trùng có hình dạng giống như một hòn đá hoặc một viên đá, thường có màu nâu hoặc đen" +
                            " \nĐặc điểm của Ladybug:\n" +
                            "Bọ rùa thường có vỏ cứng bên ngoài, bảo vệ chúng khỏi sự tấn công của các kẻ săn mồi.\n" +
                            "Chúng có thể di chuyển chậm chạp và thường ẩn náu dưới các đá, cỏ dại hoặc trong các môi trường khác có bề mặt cứng.\n" +
                            "Bọ rùa thường ăn lá cây, gây ra sự suy yếu của cây và giảm khả năng hấp thụ ánh sáng cho quá trình quang hợp.\n" +
                            "Bọ rùa thường tạo tổ trong cây trồng bằng cách đục lỗ vào thân cây hoặc cành cây. Việc này làm suy yếu cơ hệ vận chuyển chất dinh dưỡng và nước trong cây, gây ra sự suy nhược và chết cây.\n" +
                            "Làm hỏng trái: Nếu bọ rùa tấn công vào trái cây, chúng có thể làm hỏng hoặc làm giảm chất lượng của trái, khiến chúng không thể bán được hoặc không thể sử dụng được.\n" +
                            "\nCách diệt trừ Ladybug:\n" +
                            "Để kiểm soát bọ rùa và bảo vệ cây trồng, người nông dân thường áp dụng các biện pháp như sử dụng thuốc trừ sâu, sử dụng lưới che, hóa chất phòng trừ, hoặc sử dụng các biện pháp kiểm soát sinh học như sử dụng kẻ thù tự nhiên của bọ rùa.");
                    return;
            }
        }
    }
}