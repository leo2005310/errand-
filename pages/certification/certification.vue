<template>
	<view style="padding: 20rpx;">
		<view class="box">
			<uni-forms :modelValue="form" :rules="rules" ref="formRef" label-width="140rpx" label-align="right">
			  <uni-forms-item label="姓名" name="name">
			    <uni-easyinput type="text" v-model="form.name" placeholder="请输入姓名" />
			  </uni-forms-item>
			  <uni-forms-item label="本人头像" name="avatar">
			    	<uni-file-picker limit="1" :image-styles="imageStyles" :del-icon="false" :disable-preview="true"
			    						fileMediatype="image" v-model="imgs" @select="handleAvatarUploadSuccess"></uni-file-picker>
			  </uni-forms-item>
			  	<uni-forms-item label="联系方式" name="phone" required>
			  					<uni-easyinput type="text" v-model="form.phone" placeholder="请输入联系方式" />
			  				</uni-forms-item>
				<uni-forms-item label="身份证号码" name="cardNo" required>
									<uni-easyinput type="text" v-model="form.cardNo" placeholder="请输入身份证号码" />
								</uni-forms-item>
			  
			  </uni-forms>

			
			
			
			</view>
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			
		}
	}
</script>

<style>

</style>
