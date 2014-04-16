package huadi.com.Route;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class BikeOverlay extends ItemizedOverlay<OverlayItem>
{	
	//宣告items列表，負責儲存圖標列表
	private static List<OverlayItem> items = new ArrayList<OverlayItem>();
	Context mcontext;//為了用MainActivity叫Toast等
	
	public BikeOverlay(Drawable defaultMarker, Context context)
	{
		super(boundCenterBottom(defaultMarker));
		mcontext = context;
		//items.add(new OverlayItem( , null, null));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0408578889 * 1E6), (int)( 121.567904444 * 1E6)), "0001", " 捷運市政府站(3號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0410833333 * 1E6), (int)( 121.5578 * 1E6)), "0002", " 捷運國父紀念館站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0377972222 * 1E6), (int)( 121.565169444 * 1E6)), "0003", " 台北市政府 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0360361111 * 1E6), (int)( 121.562325 * 1E6)), "0004", " 市民廣場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0365638889 * 1E6), (int)( 121.5686639 * 1E6)), "0005", " 興雅國中 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0347361111 * 1E6), (int)( 121.565658333 * 1E6)), "0006", " 世貿二館 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0330388889 * 1E6), (int)( 121.565619444 * 1E6)), "0007", " 信義廣場(台北101) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0352138889 * 1E6), (int)( 121.563688889 * 1E6)), "0008", " 世貿三館 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03159 * 1E6), (int)( 121.574353 * 1E6)), "0009", " 松德站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0286611111 * 1E6), (int)( 121.566116667 * 1E6)), "0010", " 台北市災害應變中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.034937 * 1E6), (int)( 121.55762 * 1E6)), "0011", " 三張犁 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026679 * 1E6), (int)( 121.561747 * 1E6)), "0012", " 臺北醫學大學 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03809 * 1E6), (int)( 121.58367 * 1E6)), "0013", " 福德公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.06424 * 1E6), (int)( 121.54037 * 1E6)), "0014", " 榮星花園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.049845 * 1E6), (int)( 121.571885 * 1E6)), "0015", " 饒河夜市 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036084 * 1E6), (int)( 121.579135 * 1E6)), "0016", " 松山家商 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0584 * 1E6), (int)( 121.55504 * 1E6)), "0017", " 民生光復路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048268 * 1E6), (int)( 121.552278 * 1E6)), "0018", " 社教館 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02863 * 1E6), (int)( 121.56981 * 1E6)), "0019", " 中強公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.025896 * 1E6), (int)( 121.543293 * 1E6)), "0020", " 捷運科技大樓站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.057985 * 1E6), (int)( 121.548982 * 1E6)), "0021", " 民生敦化路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048616 * 1E6), (int)( 121.578095 * 1E6)), "0022", " 松山車站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.055074 * 1E6), (int)( 121.602798 * 1E6)), "0023", " 東新國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03293 * 1E6), (int)( 121.53747 * 1E6)), "0024", " 信義建國路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04543 * 1E6), (int)( 121.57205 * 1E6)), "0025", " 永吉松信路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.050142 * 1E6), (int)( 121.592375 * 1E6)), "0026", " 捷運昆陽站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05469 * 1E6), (int)( 121.61669 * 1E6)), "0027", " 捷運南港展覽館站(5號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04814 * 1E6), (int)( 121.57467 * 1E6)), "0028", " 五常公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03164 * 1E6), (int)( 121.52655 * 1E6)), "0029", " 金山愛國路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.017054 * 1E6), (int)( 121.544352 * 1E6)), "0030", " 基隆長興路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022413 * 1E6), (int)( 121.53456 * 1E6)), "0031", " 辛亥新生路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023884 * 1E6), (int)( 121.553161 * 1E6)), "0032", " 捷運六張犁站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04878 * 1E6), (int)( 121.56087 * 1E6)), "0033", " 中崙高中 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.058369 * 1E6), (int)( 121.532934 * 1E6)), "0034", " 捷運行天宮站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059978 * 1E6), (int)( 121.533302 * 1E6)), "0035", " 捷運行天宮站(3號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02101 * 1E6), (int)( 121.54153 * 1E6)), "0036", " 臺大資訊大樓 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0337 * 1E6), (int)( 121.529166 * 1E6)), "0037", " 捷運東門站(4號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02665 * 1E6), (int)( 121.52889 * 1E6)), "0038", " 臺灣師範大學(圖書館) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.058 * 1E6), (int)( 121.61422 * 1E6)), "0039", " 南港世貿公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04287 * 1E6), (int)( 121.5864 * 1E6)), "0040", " 玉成公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.047425 * 1E6), (int)( 121.613706 * 1E6)), "0041", " 中研公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04431 * 1E6), (int)( 121.58174 * 1E6)), "0042", " 捷運後山埤站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.035639 * 1E6), (int)( 121.614154 * 1E6)), "0043", " 凌雲市場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05973 * 1E6), (int)( 121.616187 * 1E6)), "0044", " 捷運南港軟體園區站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.01476 * 1E6), (int)( 121.534538 * 1E6)), "0045", " 捷運公館站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05646 * 1E6), (int)( 121.611027 * 1E6)), "0046", " 南港國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.041924 * 1E6), (int)( 121.533862 * 1E6)), "0047", " 捷運忠孝新生(3號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05247 * 1E6), (int)( 121.608202 * 1E6)), "0048", " 南港車站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040901 * 1E6), (int)( 121.548252 * 1E6)), "0049", " 龍門廣場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.062002 * 1E6), (int)( 121.560186 * 1E6)), "0050", " 民權運動公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.065031 * 1E6), (int)( 121.536775 * 1E6)), "0051", " 建國農安街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.054761 * 1E6), (int)( 121.536925 * 1E6)), "0052", " 建國長春路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.044781 * 1E6), (int)( 121.536609 * 1E6)), "0053", " 八德市場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.028798 * 1E6), (int)( 121.538073 * 1E6)), "0054", " 臺北市立圖書館(總館) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.049505 * 1E6), (int)( 121.549408 * 1E6)), "0055", " 臺北田徑場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.038954 * 1E6), (int)( 121.522334 * 1E6)), "0056", " Y-17青少年育樂中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026217 * 1E6), (int)( 121.53519 * 1E6)), "0057", " 新生和平路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.045267 * 1E6), (int)( 121.5222 * 1E6)), "0058", " 捷運善導寺站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.052227 * 1E6), (int)( 121.525805 * 1E6)), "0059", " 林森公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.064317 * 1E6), (int)( 121.533487 * 1E6)), "0060", " 中山行政中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0131 * 1E6), (int)( 121.539723 * 1E6)), "0061", " 台灣科技大學 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026827 * 1E6), (int)( 121.520258 * 1E6)), "0062", " 南昌公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037569 * 1E6), (int)( 121.545632 * 1E6)), "0063", " 仁愛醫院 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037773 * 1E6), (int)( 121.517029 * 1E6)), "0064", " 國家圖書館 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022725 * 1E6), (int)( 121.502708 * 1E6)), "0065", " 青年公園3號出口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.007528 * 1E6), (int)( 121.537188 * 1E6)), "0066", " 師範大學公館校區 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.042973 * 1E6), (int)( 121.516428 * 1E6)), "0067", " 捷運臺大醫院(4號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.025865 * 1E6), (int)( 121.506536 * 1E6)), "0068", " 國興青年路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.999837 * 1E6), (int)( 121.547778 * 1E6)), "0069", " 興豐公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032752 * 1E6), (int)( 121.561645 * 1E6)), "0070", " 捷運台北101/世貿站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032985 * 1E6), (int)( 121.554204 * 1E6)), "0071", " 捷運信義安和站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048611 * 1E6), (int)( 121.529346 * 1E6)), "0072", " 新生長安路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.072228 * 1E6), (int)( 121.510195 * 1E6)), "0073", " 酒泉延平路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033817 * 1E6), (int)( 121.530547 * 1E6)), "0074", " 信義連雲街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.030055 * 1E6), (int)( 121.557841 * 1E6)), "0075", " 基隆光復路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.056387 * 1E6), (int)( 121.527522 * 1E6)), "0076", " 新生長春路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059147 * 1E6), (int)( 121.56297 * 1E6)), "0077", " 民生活動中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.071824 * 1E6), (int)( 121.519287 * 1E6)), "0078", " 捷運圓山站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.061285 * 1E6), (int)( 121.520205 * 1E6)), "0079", " 捷運民權西路站(3號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02751 * 1E6), (int)( 121.495869 * 1E6)), "0080", " 華江高中 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.020547 * 1E6), (int)( 121.528552 * 1E6)), "0081", " 捷運台電大樓站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.041778 * 1E6), (int)( 121.508693 * 1E6)), "0082", " 捷運西門站(3號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033156 * 1E6), (int)( 121.535161 * 1E6)), "0083", " 捷運大安森林公園站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.029705 * 1E6), (int)( 121.502899 * 1E6)), "0084", " 復華花園新城 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033362 * 1E6), (int)( 121.54911 * 1E6)), "0085", " 信義敦化路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.062344 * 1E6), (int)( 121.545138 * 1E6)), "0086", " 民權復興路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033078 * 1E6), (int)( 121.543057 * 1E6)), "0087", " 捷運大安站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032835 * 1E6), (int)( 121.571274 * 1E6)), "0088", " 捷運象山站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.027323 * 1E6), (int)( 121.516385 * 1E6)), "0089", " 和平重慶路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037783 * 1E6), (int)( 121.501708 * 1E6)), "0090", " 老松國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.070629 * 1E6), (int)( 121.523268 * 1E6)), "0091", " 市立美術館 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.046618 * 1E6), (int)( 121.507169 * 1E6)), "0092", " 開封西寧路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023877 * 1E6), (int)( 121.569836 * 1E6)), "0093", " 吳興公車總站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.993254 * 1E6), (int)( 121.541059 * 1E6)), "0094", " 捷運景美站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023393 * 1E6), (int)( 121.497679 * 1E6)), "0095", " 東園國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.061567 * 1E6), (int)( 121.566558 * 1E6)), "0096", " 三民公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.082825 * 1E6), (int)( 121.524721 * 1E6)), "0097", " 捷運劍潭站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.999378 * 1E6), (int)( 121.540197 * 1E6)), "0098", " 羅斯福景隆街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.057866 * 1E6), (int)( 121.520711 * 1E6)), "0099", " 捷運雙連站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.045753 * 1E6), (int)( 121.530697 * 1E6)), "0100", " 金山市民路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.043668 * 1E6), (int)( 121.528487 * 1E6)), "0101", " 華山文創園區 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02043 * 1E6), (int)( 121.525322 * 1E6)), "0102", " 臺北市客家文化主題公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.031974 * 1E6), (int)( 121.500474 * 1E6)), "0103", " 萬大興寧街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.004023 * 1E6), (int)( 121.54074 * 1E6)), "0104", " 台北花木批發市場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.044412 * 1E6), (int)( 121.505409 * 1E6)), "0105", " 峨嵋停車場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032932 * 1E6), (int)( 121.497674 * 1E6)), "0106", " 西園艋舺路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036402 * 1E6), (int)( 121.509422 * 1E6)), "0107", " 捷運小南門站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.073306 * 1E6), (int)( 121.515843 * 1E6)), "0108", " 臺北孔廟 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.071606 * 1E6), (int)( 121.530805 * 1E6)), "0109", " 林安泰古厝 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.086376 * 1E6), (int)( 121.560888 * 1E6)), "0110", " 文湖國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040184 * 1E6), (int)( 121.543497 * 1E6)), "0111", " 捷運忠孝復興站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.137456 * 1E6), (int)( 121.503124 * 1E6)), "0112", " 捷運新北投站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037724 * 1E6), (int)( 121.561178 * 1E6)), "0113", " 仁愛逸仙路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.109908 * 1E6), (int)( 121.530386 * 1E6)), "0114", " 蘭雅公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048222 * 1E6), (int)( 121.520526 * 1E6)), "0115", " 臺北轉運站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.096122 * 1E6), (int)( 121.530215 * 1E6)), "0116", " 福林公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.132581 * 1E6), (int)( 121.498618 * 1E6)), "0117", " 捷運北投站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.136929 * 1E6), (int)( 121.499152 * 1E6)), "0118", " 大業大同街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.08418 * 1E6), (int)( 121.555116 * 1E6)), "0119", " 捷運劍南路站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.035479 * 1E6), (int)( 121.50026 * 1E6)), "0120", " 捷運龍山寺站(1號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05298 * 1E6), (int)( 121.540568 * 1E6)), "0121", " 龍江南京路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.079681 * 1E6), (int)( 121.575458 * 1E6)), "0122", " 捷運港墘站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.116325 * 1E6), (int)( 121.534136 * 1E6)), "0123", " 天母運動公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.115863 * 1E6), (int)( 121.518163 * 1E6)), "0124", " 振華公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.038609 * 1E6), (int)( 121.498495 * 1E6)), "0125", " 華西公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022073 * 1E6), (int)( 121.548336 * 1E6)), "0126", " 敦化基隆路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.073277 * 1E6), (int)( 121.619521 * 1E6)), "0127", " 東湖國中 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026808 * 1E6), (int)( 121.546726 * 1E6)), "0128", " 成功國宅 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.078292 * 1E6), (int)( 121.585264 * 1E6)), "0129", " 捷運文德站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.031445 * 1E6), (int)( 121.519411 * 1E6)), "0130", " 羅斯福寧波東街口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.079322 * 1E6), (int)( 121.568688 * 1E6)), "0131", " 洲子二號公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.01603085 * 1E6), (int)( 121.5331757 * 1E6)), "0132", " 羅斯福新生南路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.111839 * 1E6), (int)( 121.525888 * 1E6)), "0133", " 蘭興公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.10336 * 1E6), (int)( 121.522629 * 1E6)), "0134", " 捷運芝山站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.114513 * 1E6), (int)( 121.515677 * 1E6)), "0135", " 捷運石牌站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.118049 * 1E6), (int)( 121.517512 * 1E6)), "0136", " 國立臺北護理健康大學 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.137976 * 1E6), (int)( 121.493066 * 1E6)), "0137", " 國防大學 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040558 * 1E6), (int)( 121.575372 * 1E6)), "0138", " 捷運永春站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.054501 * 1E6), (int)( 121.510549 * 1E6)), "0139", " 永樂市場 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.063404 * 1E6), (int)( 121.512909 * 1E6)), "0140", " 捷運大橋頭站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.989902 * 1E6), (int)( 121.569984 * 1E6)), "0141", " 文山行政中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.997747 * 1E6), (int)( 121.574214 * 1E6)), "0142", " 捷運木柵站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.997659 * 1E6), (int)( 121.578752 * 1E6)), "0143", " 捷運動物園站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.988363 * 1E6), (int)( 121.576536 * 1E6)), "0144", " 國立政治大學 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.066688 * 1E6), (int)( 121.516149 * 1E6)), "0145", " 樹德公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.092546 * 1E6), (int)( 121.526556 * 1E6)), "0146", " 捷運士林站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.089175 * 1E6), (int)( 121.521814 * 1E6)), "0147", " 士林運動中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.110331 * 1E6), (int)( 121.518316 * 1E6)), "0148", " 捷運明德站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.116665 * 1E6), (int)( 121.509621 * 1E6)), "0149", " 北投運動中心 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036568 * 1E6), (int)( 121.57343 * 1E6)), "0150", " 松德公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.987507 * 1E6), (int)( 121.549827 * 1E6)), "0151", " 考試院 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.08521 * 1E6), (int)( 121.519175 * 1E6)), "0152", " 百齡國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059885 * 1E6), (int)( 121.516299 * 1E6)), "0153", " 蔣渭水紀念公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.093396 * 1E6), (int)( 121.519867 * 1E6)), "0154", " 中正基河路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.076193 * 1E6), (int)( 121.57505 * 1E6)), "0155", " 瑞光港墘路口 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.068409 * 1E6), (int)( 121.615938 * 1E6)), "0156", " 東湖國小 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.053082 * 1E6), (int)( 121.52029 * 1E6)), "0160", " 捷運中山站(2號出口) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.131143 * 1E6), (int)( 121.503768 * 1E6)), "0161", " 大豐公園 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.99116 * 1E6), (int)( 121.53398 * 1E6)), "0501", " 大鵬華城 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.068914 * 1E6), (int)( 121.662748 * 1E6)), "0502", " 汐止火車站 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.064162 * 1E6), (int)( 121.658301 * 1E6)), "0503", " 汐止區公所 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.07315 * 1E6), (int)( 121.662555 * 1E6)), "0504", " 國泰綜合醫院 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.979649 * 1E6), (int)( 121.546319 * 1E6)), "0505", " 裕隆公園 " ));

		
		populate();//準備ItemizedOverly建構後，所需的處理動作
	}

	public void addOverlay(OverlayItem overlay) 
	{
		items.add(overlay);
	    populate();//準備ItemizedOverly建構後，所需的處理動作
	}
	
	@Override
	protected OverlayItem createItem(int i) //被populate()呼叫
	{//依據參數 i 抓取對應的OverlayItem顯示在地圖上
		return items.get(i);
	}

	@Override
	public int size() //被populate()呼叫，用以計算圖標的數量
	{
		return items.size();
	}
	
	@Override
	protected boolean onTap(int index) //使用者點選到圖標時觸發
	{
		new RealTimeBike(items.get(index).getSnippet(),mcontext).execute(items.get(index).getTitle());

		return true;
	}
	
	public static GeoPoint minDistience(GeoPoint userPoint)//計算離自己最近的租賃站
	{
		Location locationA = new Location("point A");
		locationA.setLatitude(userPoint.getLatitudeE6() / 1E6);  //自己
		locationA.setLongitude(userPoint.getLongitudeE6() / 1E6);  

		Location locationB = new Location("point B");
		
		float distance[] = new float[items.size()];

		for(int i = 0 ; i < items.size() ; i++)
		{
			locationB.setLatitude(items.get(i).getPoint().getLatitudeE6() / 1E6);  //站點
			locationB.setLongitude(items.get(i).getPoint().getLongitudeE6() / 1E6);
			
			distance[i] = locationA.distanceTo(locationB); //記錄距離(公尺)
		}
		
		float min = distance[0];
		int minI = 0;
		
		for(int i=0 ; i<distance.length ; i++) //計算最小距離
		{
			if(distance[i] <= min)
			{
				min = distance[i];
				minI = i;
			}
		}
		return items.get(minI).getPoint();
	}
	
	public static GeoPoint CloserStation(GeoPoint start, GeoPoint end, List<OverlayItem> station)//找起點到車站+車站到終點 最近的點
	{
		Location start_Location = new Location("point A");
		Location end_Location = new Location("point B");
		Location station_Location = new Location("point C");
		
		start_Location.setLatitude(start.getLatitudeE6() / 1E6);  
		start_Location.setLongitude(start.getLongitudeE6() / 1E6);
		
		end_Location.setLatitude(end.getLatitudeE6() / 1E6);  
		end_Location.setLongitude(end.getLongitudeE6() / 1E6);
		
		float distance[] = new float[station.size()];

		for(int i = 0 ; i < station.size() ; i++)
		{
			station_Location.setLatitude(station.get(i).getPoint().getLatitudeE6() / 1E6);  
			station_Location.setLongitude(station.get(i).getPoint().getLongitudeE6() / 1E6);
			
			distance[i] = start_Location.distanceTo(station_Location) + station_Location.distanceTo(end_Location); //起點到站+站到終點
		}
		
		float min = distance[0];
		int minI = 0;
		
		for(int i=0 ; i<distance.length ; i++)
		{
			if(distance[i] <= min)
			{
				min = distance[i];
				minI = i;
			}
		}
		return station.get(minI).getPoint();//起點到車站+車站到終點 最近的點
	}
	
	public static List<GeoPoint> WayStation(GeoPoint start, GeoPoint end, List<OverlayItem> station, List<GeoPoint> route)//找出路上的車站
	{
		//先找到 車站終點 比 起點到終點 近的點
		Location start_Location = new Location("point A");
		Location end_Location = new Location("point B");
		Location station_Location = new Location("point C");
		
		List<OverlayItem> closer_station = new ArrayList<OverlayItem>();//車站終點 比 起點到終點 近的點 們
		
		start_Location.setLatitude(start.getLatitudeE6() / 1E6);  
		start_Location.setLongitude(start.getLongitudeE6() / 1E6);
		
		end_Location.setLatitude(end.getLatitudeE6() / 1E6);  
		end_Location.setLongitude(end.getLongitudeE6() / 1E6);		
		
		for(int i = 0 ; i < station.size() ; i++)
		{
			station_Location.setLatitude(station.get(i).getPoint().getLatitudeE6() / 1E6);  
			station_Location.setLongitude(station.get(i).getPoint().getLongitudeE6() / 1E6);
			
			if(station_Location.distanceTo(end_Location) < start_Location.distanceTo(end_Location))
				closer_station.add(station.get(i)); //車站終點 比 起點到終點 近的點 們
		}		
		//找起點到車站+車站到終點 最近的點
		if(closer_station.size() > 1)
		{
			GeoPoint nearest = CloserStation(start, end, closer_station);		
			route.add(nearest);
		
			return WayStation(nearest, end, closer_station, route);
		}
		else
			return route;
	}
	
	public static List<OverlayItem> GetItems()
	{
		return items;
	}

}
