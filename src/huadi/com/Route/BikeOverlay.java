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
	//�ŧiitems�C��A�t�d�x�s�ϼЦC��
	private static List<OverlayItem> items = new ArrayList<OverlayItem>();
	Context mcontext;//���F��MainActivity�sToast��
	
	public BikeOverlay(Drawable defaultMarker, Context context)
	{
		super(boundCenterBottom(defaultMarker));
		mcontext = context;
		//items.add(new OverlayItem( , null, null));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0408578889 * 1E6), (int)( 121.567904444 * 1E6)), "0001", " ���B���F����(3���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0410833333 * 1E6), (int)( 121.5578 * 1E6)), "0002", " ���B��������]�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0377972222 * 1E6), (int)( 121.565169444 * 1E6)), "0003", " �x�_���F�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0360361111 * 1E6), (int)( 121.562325 * 1E6)), "0004", " �����s�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0365638889 * 1E6), (int)( 121.5686639 * 1E6)), "0005", " �����ꤤ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0347361111 * 1E6), (int)( 121.565658333 * 1E6)), "0006", " �@�T�G�] " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0330388889 * 1E6), (int)( 121.565619444 * 1E6)), "0007", " �H�q�s��(�x�_101) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0352138889 * 1E6), (int)( 121.563688889 * 1E6)), "0008", " �@�T�T�] " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03159 * 1E6), (int)( 121.574353 * 1E6)), "0009", " �Q�w�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0286611111 * 1E6), (int)( 121.566116667 * 1E6)), "0010", " �x�_���a�`���ܤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.034937 * 1E6), (int)( 121.55762 * 1E6)), "0011", " �T�i�p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026679 * 1E6), (int)( 121.561747 * 1E6)), "0012", " �O�_��Ǥj�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03809 * 1E6), (int)( 121.58367 * 1E6)), "0013", " �ּw���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.06424 * 1E6), (int)( 121.54037 * 1E6)), "0014", " �a�P��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.049845 * 1E6), (int)( 121.571885 * 1E6)), "0015", " �Ǫe�]�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036084 * 1E6), (int)( 121.579135 * 1E6)), "0016", " �Q�s�a�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0584 * 1E6), (int)( 121.55504 * 1E6)), "0017", " ���ͥ��_���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048268 * 1E6), (int)( 121.552278 * 1E6)), "0018", " �����] " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02863 * 1E6), (int)( 121.56981 * 1E6)), "0019", " ���j���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.025896 * 1E6), (int)( 121.543293 * 1E6)), "0020", " ���B��ޤj�ӯ� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.057985 * 1E6), (int)( 121.548982 * 1E6)), "0021", " ���ʹ��Ƹ��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048616 * 1E6), (int)( 121.578095 * 1E6)), "0022", " �Q�s���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.055074 * 1E6), (int)( 121.602798 * 1E6)), "0023", " �F�s��p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03293 * 1E6), (int)( 121.53747 * 1E6)), "0024", " �H�q�ذ���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04543 * 1E6), (int)( 121.57205 * 1E6)), "0025", " �æN�Q�H���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.050142 * 1E6), (int)( 121.592375 * 1E6)), "0026", " ���B������(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05469 * 1E6), (int)( 121.61669 * 1E6)), "0027", " ���B�n��i���]��(5���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04814 * 1E6), (int)( 121.57467 * 1E6)), "0028", " ���`���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.03164 * 1E6), (int)( 121.52655 * 1E6)), "0029", " ���s�R����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.017054 * 1E6), (int)( 121.544352 * 1E6)), "0030", " �򶩪������f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022413 * 1E6), (int)( 121.53456 * 1E6)), "0031", " ����s�͸��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023884 * 1E6), (int)( 121.553161 * 1E6)), "0032", " ���B���i�p�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04878 * 1E6), (int)( 121.56087 * 1E6)), "0033", " ���[���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.058369 * 1E6), (int)( 121.532934 * 1E6)), "0034", " ���B��Ѯc��(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059978 * 1E6), (int)( 121.533302 * 1E6)), "0035", " ���B��Ѯc��(3���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02101 * 1E6), (int)( 121.54153 * 1E6)), "0036", " �O�j��T�j�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0337 * 1E6), (int)( 121.529166 * 1E6)), "0037", " ���B�F����(4���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02665 * 1E6), (int)( 121.52889 * 1E6)), "0038", " �O�W�v�d�j��(�Ϯ��]) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.058 * 1E6), (int)( 121.61422 * 1E6)), "0039", " �n��@�T���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04287 * 1E6), (int)( 121.5864 * 1E6)), "0040", " �ɦ����� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.047425 * 1E6), (int)( 121.613706 * 1E6)), "0041", " ���㤽�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.04431 * 1E6), (int)( 121.58174 * 1E6)), "0042", " ���B��s��(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.035639 * 1E6), (int)( 121.614154 * 1E6)), "0043", " �ⶳ���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05973 * 1E6), (int)( 121.616187 * 1E6)), "0044", " ���B�n��n���ϯ�(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.01476 * 1E6), (int)( 121.534538 * 1E6)), "0045", " ���B���]��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05646 * 1E6), (int)( 121.611027 * 1E6)), "0046", " �n���p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.041924 * 1E6), (int)( 121.533862 * 1E6)), "0047", " ���B�����s��(3���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05247 * 1E6), (int)( 121.608202 * 1E6)), "0048", " �n�䨮�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040901 * 1E6), (int)( 121.548252 * 1E6)), "0049", " �s���s�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.062002 * 1E6), (int)( 121.560186 * 1E6)), "0050", " ���v�B�ʤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.065031 * 1E6), (int)( 121.536775 * 1E6)), "0051", " �ذ�A�w��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.054761 * 1E6), (int)( 121.536925 * 1E6)), "0052", " �ذ���K���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.044781 * 1E6), (int)( 121.536609 * 1E6)), "0053", " �K�w���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.028798 * 1E6), (int)( 121.538073 * 1E6)), "0054", " �O�_���߹Ϯ��](�`�]) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.049505 * 1E6), (int)( 121.549408 * 1E6)), "0055", " �O�_�Ю|�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.038954 * 1E6), (int)( 121.522334 * 1E6)), "0056", " Y-17�C�֦~�|�֤��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026217 * 1E6), (int)( 121.53519 * 1E6)), "0057", " �s�ͩM�����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.045267 * 1E6), (int)( 121.5222 * 1E6)), "0058", " ���B���ɦx��(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.052227 * 1E6), (int)( 121.525805 * 1E6)), "0059", " �L�ˤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.064317 * 1E6), (int)( 121.533487 * 1E6)), "0060", " ���s��F���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.0131 * 1E6), (int)( 121.539723 * 1E6)), "0061", " �x�W��ޤj�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026827 * 1E6), (int)( 121.520258 * 1E6)), "0062", " �n������ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037569 * 1E6), (int)( 121.545632 * 1E6)), "0063", " ���R��| " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037773 * 1E6), (int)( 121.517029 * 1E6)), "0064", " ��a�Ϯ��] " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022725 * 1E6), (int)( 121.502708 * 1E6)), "0065", " �C�~����3���X�f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.007528 * 1E6), (int)( 121.537188 * 1E6)), "0066", " �v�d�j�Ǥ��]�հ� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.042973 * 1E6), (int)( 121.516428 * 1E6)), "0067", " ���B�O�j��|(4���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.025865 * 1E6), (int)( 121.506536 * 1E6)), "0068", " �꿳�C�~���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.999837 * 1E6), (int)( 121.547778 * 1E6)), "0069", " ���פ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032752 * 1E6), (int)( 121.561645 * 1E6)), "0070", " ���B�x�_101/�@�T�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032985 * 1E6), (int)( 121.554204 * 1E6)), "0071", " ���B�H�q�w�M�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048611 * 1E6), (int)( 121.529346 * 1E6)), "0072", " �s�ͪ��w���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.072228 * 1E6), (int)( 121.510195 * 1E6)), "0073", " �s�u�������f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033817 * 1E6), (int)( 121.530547 * 1E6)), "0074", " �H�q�s����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.030055 * 1E6), (int)( 121.557841 * 1E6)), "0075", " �򶩥��_���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.056387 * 1E6), (int)( 121.527522 * 1E6)), "0076", " �s�ͪ��K���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059147 * 1E6), (int)( 121.56297 * 1E6)), "0077", " ���ͬ��ʤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.071824 * 1E6), (int)( 121.519287 * 1E6)), "0078", " ���B��s��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.061285 * 1E6), (int)( 121.520205 * 1E6)), "0079", " ���B���v�����(3���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02751 * 1E6), (int)( 121.495869 * 1E6)), "0080", " �ئ����� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.020547 * 1E6), (int)( 121.528552 * 1E6)), "0081", " ���B�x�q�j�ӯ�(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.041778 * 1E6), (int)( 121.508693 * 1E6)), "0082", " ���B�����(3���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033156 * 1E6), (int)( 121.535161 * 1E6)), "0083", " ���B�j�w�˪L���鯸 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.029705 * 1E6), (int)( 121.502899 * 1E6)), "0084", " �_�ت��s�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033362 * 1E6), (int)( 121.54911 * 1E6)), "0085", " �H�q���Ƹ��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.062344 * 1E6), (int)( 121.545138 * 1E6)), "0086", " ���v�_�����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.033078 * 1E6), (int)( 121.543057 * 1E6)), "0087", " ���B�j�w�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032835 * 1E6), (int)( 121.571274 * 1E6)), "0088", " ���B�H�s�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.027323 * 1E6), (int)( 121.516385 * 1E6)), "0089", " �M�����y���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037783 * 1E6), (int)( 121.501708 * 1E6)), "0090", " �ѪQ��p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.070629 * 1E6), (int)( 121.523268 * 1E6)), "0091", " ���߬��N�] " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.046618 * 1E6), (int)( 121.507169 * 1E6)), "0092", " �}�ʦ����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023877 * 1E6), (int)( 121.569836 * 1E6)), "0093", " �d�������`�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.993254 * 1E6), (int)( 121.541059 * 1E6)), "0094", " ���B������ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.023393 * 1E6), (int)( 121.497679 * 1E6)), "0095", " �F���p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.061567 * 1E6), (int)( 121.566558 * 1E6)), "0096", " �T������ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.082825 * 1E6), (int)( 121.524721 * 1E6)), "0097", " ���B�C�毸(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.999378 * 1E6), (int)( 121.540197 * 1E6)), "0098", " ù���ִ�����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.057866 * 1E6), (int)( 121.520711 * 1E6)), "0099", " ���B���s��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.045753 * 1E6), (int)( 121.530697 * 1E6)), "0100", " ���s�������f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.043668 * 1E6), (int)( 121.528487 * 1E6)), "0101", " �ؤs��ж�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.02043 * 1E6), (int)( 121.525322 * 1E6)), "0102", " �O�_���Ȯa��ƥD�D���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.031974 * 1E6), (int)( 121.500474 * 1E6)), "0103", " �U�j�����f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.004023 * 1E6), (int)( 121.54074 * 1E6)), "0104", " �x�_����o���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.044412 * 1E6), (int)( 121.505409 * 1E6)), "0105", " �o�ݰ����� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.032932 * 1E6), (int)( 121.497674 * 1E6)), "0106", " ���S�U���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036402 * 1E6), (int)( 121.509422 * 1E6)), "0107", " ���B�p�n����(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.073306 * 1E6), (int)( 121.515843 * 1E6)), "0108", " �O�_�ռq " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.071606 * 1E6), (int)( 121.530805 * 1E6)), "0109", " �L�w���j�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.086376 * 1E6), (int)( 121.560888 * 1E6)), "0110", " ����p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040184 * 1E6), (int)( 121.543497 * 1E6)), "0111", " ���B�����_����(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.137456 * 1E6), (int)( 121.503124 * 1E6)), "0112", " ���B�s�_�미 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.037724 * 1E6), (int)( 121.561178 * 1E6)), "0113", " ���R�h�P���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.109908 * 1E6), (int)( 121.530386 * 1E6)), "0114", " �������� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.048222 * 1E6), (int)( 121.520526 * 1E6)), "0115", " �O�_��B�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.096122 * 1E6), (int)( 121.530215 * 1E6)), "0116", " �֪L���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.132581 * 1E6), (int)( 121.498618 * 1E6)), "0117", " ���B�_�미 " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.136929 * 1E6), (int)( 121.499152 * 1E6)), "0118", " �j�~�j�P��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.08418 * 1E6), (int)( 121.555116 * 1E6)), "0119", " ���B�C�n����(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.035479 * 1E6), (int)( 121.50026 * 1E6)), "0120", " ���B�s�s�x��(1���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.05298 * 1E6), (int)( 121.540568 * 1E6)), "0121", " �s���n�ʸ��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.079681 * 1E6), (int)( 121.575458 * 1E6)), "0122", " ���B���Y��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.116325 * 1E6), (int)( 121.534136 * 1E6)), "0123", " �ѥ��B�ʤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.115863 * 1E6), (int)( 121.518163 * 1E6)), "0124", " ���ؤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.038609 * 1E6), (int)( 121.498495 * 1E6)), "0125", " �ئ褽�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.022073 * 1E6), (int)( 121.548336 * 1E6)), "0126", " ���ư򶩸��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.073277 * 1E6), (int)( 121.619521 * 1E6)), "0127", " �F��ꤤ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.026808 * 1E6), (int)( 121.546726 * 1E6)), "0128", " ���\��v " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.078292 * 1E6), (int)( 121.585264 * 1E6)), "0129", " ���B��w��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.031445 * 1E6), (int)( 121.519411 * 1E6)), "0130", " ù���ֹ�i�F��f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.079322 * 1E6), (int)( 121.568688 * 1E6)), "0131", " �w�l�G������ " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.01603085 * 1E6), (int)( 121.5331757 * 1E6)), "0132", " ù���ַs�ͫn���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.111839 * 1E6), (int)( 121.525888 * 1E6)), "0133", " �������� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.10336 * 1E6), (int)( 121.522629 * 1E6)), "0134", " ���B�ۤs��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.114513 * 1E6), (int)( 121.515677 * 1E6)), "0135", " ���B�۵P��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.118049 * 1E6), (int)( 121.517512 * 1E6)), "0136", " ��߻O�_�@�z���d�j�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.137976 * 1E6), (int)( 121.493066 * 1E6)), "0137", " �꨾�j�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.040558 * 1E6), (int)( 121.575372 * 1E6)), "0138", " ���B�ìK��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.054501 * 1E6), (int)( 121.510549 * 1E6)), "0139", " �ü֥��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.063404 * 1E6), (int)( 121.512909 * 1E6)), "0140", " ���B�j���Y��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.989902 * 1E6), (int)( 121.569984 * 1E6)), "0141", " ��s��F���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.997747 * 1E6), (int)( 121.574214 * 1E6)), "0142", " ���B��]�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.997659 * 1E6), (int)( 121.578752 * 1E6)), "0143", " ���B�ʪ��鯸(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.988363 * 1E6), (int)( 121.576536 * 1E6)), "0144", " ��߬F�v�j�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.066688 * 1E6), (int)( 121.516149 * 1E6)), "0145", " ��w���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.092546 * 1E6), (int)( 121.526556 * 1E6)), "0146", " ���B�h�L��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.089175 * 1E6), (int)( 121.521814 * 1E6)), "0147", " �h�L�B�ʤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.110331 * 1E6), (int)( 121.518316 * 1E6)), "0148", " ���B���w�� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.116665 * 1E6), (int)( 121.509621 * 1E6)), "0149", " �_��B�ʤ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.036568 * 1E6), (int)( 121.57343 * 1E6)), "0150", " �Q�w���� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.987507 * 1E6), (int)( 121.549827 * 1E6)), "0151", " �Ҹհ| " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.08521 * 1E6), (int)( 121.519175 * 1E6)), "0152", " ���ְ�p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.059885 * 1E6), (int)( 121.516299 * 1E6)), "0153", " �������������� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.093396 * 1E6), (int)( 121.519867 * 1E6)), "0154", " ������e���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.076193 * 1E6), (int)( 121.57505 * 1E6)), "0155", " ������Y���f " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.068409 * 1E6), (int)( 121.615938 * 1E6)), "0156", " �F���p " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.053082 * 1E6), (int)( 121.52029 * 1E6)), "0160", " ���B���s��(2���X�f) " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.131143 * 1E6), (int)( 121.503768 * 1E6)), "0161", " �j�פ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.99116 * 1E6), (int)( 121.53398 * 1E6)), "0501", " �j�P�ث� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.068914 * 1E6), (int)( 121.662748 * 1E6)), "0502", " ��������� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.064162 * 1E6), (int)( 121.658301 * 1E6)), "0503", " ����Ϥ��� " ));
		items.add(new OverlayItem(new GeoPoint((int)( 25.07315 * 1E6), (int)( 121.662555 * 1E6)), "0504", " �����X��| " ));
		items.add(new OverlayItem(new GeoPoint((int)( 24.979649 * 1E6), (int)( 121.546319 * 1E6)), "0505", " �ζ����� " ));

		
		populate();//�ǳ�ItemizedOverly�غc��A�һݪ��B�z�ʧ@
	}

	public void addOverlay(OverlayItem overlay) 
	{
		items.add(overlay);
	    populate();//�ǳ�ItemizedOverly�غc��A�һݪ��B�z�ʧ@
	}
	
	@Override
	protected OverlayItem createItem(int i) //�Qpopulate()�I�s
	{//�̾ڰѼ� i ���������OverlayItem��ܦb�a�ϤW
		return items.get(i);
	}

	@Override
	public int size() //�Qpopulate()�I�s�A�ΥH�p��ϼЪ��ƶq
	{
		return items.size();
	}
	
	@Override
	protected boolean onTap(int index) //�ϥΪ��I���ϼЮ�Ĳ�o
	{
		new RealTimeBike(items.get(index).getSnippet(),mcontext).execute(items.get(index).getTitle());

		return true;
	}
	
	public static GeoPoint minDistience(GeoPoint userPoint)//�p�����ۤv�̪񪺯��
	{
		Location locationA = new Location("point A");
		locationA.setLatitude(userPoint.getLatitudeE6() / 1E6);  //�ۤv
		locationA.setLongitude(userPoint.getLongitudeE6() / 1E6);  

		Location locationB = new Location("point B");
		
		float distance[] = new float[items.size()];

		for(int i = 0 ; i < items.size() ; i++)
		{
			locationB.setLatitude(items.get(i).getPoint().getLatitudeE6() / 1E6);  //���I
			locationB.setLongitude(items.get(i).getPoint().getLongitudeE6() / 1E6);
			
			distance[i] = locationA.distanceTo(locationB); //�O���Z��(����)
		}
		
		float min = distance[0];
		int minI = 0;
		
		for(int i=0 ; i<distance.length ; i++) //�p��̤p�Z��
		{
			if(distance[i] <= min)
			{
				min = distance[i];
				minI = i;
			}
		}
		return items.get(minI).getPoint();
	}
	
	public static GeoPoint CloserStation(GeoPoint start, GeoPoint end, List<OverlayItem> station)//��_�I�쨮��+��������I �̪��I
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
			
			distance[i] = start_Location.distanceTo(station_Location) + station_Location.distanceTo(end_Location); //�_�I�쯸+������I
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
		return station.get(minI).getPoint();//�_�I�쨮��+��������I �̪��I
	}
	
	public static List<GeoPoint> WayStation(GeoPoint start, GeoPoint end, List<OverlayItem> station, List<GeoPoint> route)//��X���W������
	{
		//����� �������I �� �_�I����I ���I
		Location start_Location = new Location("point A");
		Location end_Location = new Location("point B");
		Location station_Location = new Location("point C");
		
		List<OverlayItem> closer_station = new ArrayList<OverlayItem>();//�������I �� �_�I����I ���I ��
		
		start_Location.setLatitude(start.getLatitudeE6() / 1E6);  
		start_Location.setLongitude(start.getLongitudeE6() / 1E6);
		
		end_Location.setLatitude(end.getLatitudeE6() / 1E6);  
		end_Location.setLongitude(end.getLongitudeE6() / 1E6);		
		
		for(int i = 0 ; i < station.size() ; i++)
		{
			station_Location.setLatitude(station.get(i).getPoint().getLatitudeE6() / 1E6);  
			station_Location.setLongitude(station.get(i).getPoint().getLongitudeE6() / 1E6);
			
			if(station_Location.distanceTo(end_Location) < start_Location.distanceTo(end_Location))
				closer_station.add(station.get(i)); //�������I �� �_�I����I ���I ��
		}		
		//��_�I�쨮��+��������I �̪��I
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
