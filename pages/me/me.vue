<template>
	<view style="20rpx">
		<view style="text-align: center;">
			<image :src="user.avatar" style="width: 200rpx; height: 200rpx; border-radius: 50%;"></image>
						<view style="margin: 10rpx 0;">{{ user.name }}</view>
					</view>
		<view style="margin: 20rpx 0;" class="box">
			<view class="title">用户服务</view>
			<view style="display: flex;">
							<view class="cartegory-item" @click="goPage('/pages/address/address')">
								<image src="../../static/imgs/地址.png" style="width: 50%;" mode="widthFix"></image>
								<view style="flex: 1;">我的地址</view>
							</view>
							<view class="cartegory-item" @click="goPage('')">
								<image src="../../static/imgs/收支.png" style="width: 50%;" mode="widthFix"></image>
								<view style="flex: 1;">收支明细</view>
							</view>
							<view class="cartegory-item" @click="goPage('/pages/commentcenter/commentcenter')">
								<image src="../../static/imgs/评价.png" style="width: 50%;" mode="widthFix"></image>
								<view style="flex: 1;">评价中心</view>
							</view>
							<view class="cartegory-item" @click="goPage('/pages/wallet/wallet')">
								<image src="../../static/imgs/钱包.png" style="width: 50%;" mode="widthFix"></image>
								<view style="flex: 1;">我的钱包</view>
							</view>
						</view>
		 
			
			
			
			
			</view>
			<view style="margin: 20rpx 0;" class="box">
				<view class="title">骑手认证</view>
				<view style="display: flex;">
					<view class="cartegory-item" @click="goPage('/pages/certification/certification')">
						<image src="../../static/imgs/认证.png" style="width: 30%;" mode="widthFix"></image>
						<view style="flex: 1;">骑手认证</view>
						</view>
					<view class="cartegory-item" @click="goPage('')">
						<image src="../../static/imgs/跑腿.png" style="width: 30%;" mode="widthFix"></image>
						<view style="flex: 1;">骑手订单</view>
						</view>
				
			</view>
		
			
			</view>
			<view style="margin: 20rpx 0;" class="box">
				<view class="infor-item" @click="goPage('/pages/person/person')">
					<uni-icons type="person" size="18"></uni-icons>
					<text style="margin-left: 10rpx;">个人信息</text>
			             </view>
				<view class="infor-item" @click="goPage('/pages/introduce/introduce')">
						 	<uni-icons type="medal" size="18"></uni-icons>
						 	<text style="margin-left: 10rpx;">平台介绍</text>
						          </view>
				<view class="infor-item" @click="goPage('/pages/agreement/agreement')">
					<uni-icons type="paperclip" size="18"></uni-icons>
					<text style="margin-left: 10rpx;">用户协议</text>
				         </view>
				<view class="infor-item" @click="logout()">
					<uni-icons type="undo" size="18"></uni-icons>
					<text style="margin-left: 10rpx;">退出登录</text>
				         </view>
				 </view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				user: uni.getStorageSync('xm-user')
			}
		},
		methods: {
			logout() {
							uni.removeStorageSync('xm-user')
							uni.removeStorageSync('orderStore')  // 清除所有缓存数据
							uni.reLaunch({
								url: '/pages/login/login'
							})
						},
			goPage(url){
				uni.navigateTo({
					url:url
				})
			}
			
			
		}
	}
</script>

<style>
.cartegory-item {
	flex: 1; 
	display: flex; 
	justify-content: space-between; 
	align-items: center; 
	flex-direction: column; 
	grid-gap: 10rpx;
}

</style>
