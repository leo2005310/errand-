<template>
	<view style="padding: 20px;">
		<view class="box" style="padding: 60rpx 30rpx;">
			<view style="font-size: 40rpx;" >欢迎注册</view>
		<view style="margin:60rpx 0">
				<uni-forms ref="formRef" :modelValue="form" :rules="rules" validate-trigger="blur">
								<uni-forms-item  name="username"  required>
									<uni-easyinput prefix-icon="person" v-model="form.username" placeholder="请输入账号" />
								</uni-forms-item>
								<uni-forms-item name="password" required>
									<uni-easyinput type="password" prefix-icon="locked" v-model="form.password" placeholder="请输入密码" />
								</uni-forms-item>
								<uni-forms-item>
									<button @click="register" type="primary" style="width: 90%; background-color: dodgerblue;">注册</button>
								</uni-forms-item>
					
								</uni-forms>
								
	
		</view>
		<view style="text-align: right;">
			已有账号?请<navigator url="/pages/login/login" style="display: inline;margin-left: 5rpx;color: deepskyblue;">登录</navigator>
		</view>
			
		</view>
		
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
				form:{role: 'USER'},
				rules: {
				  // 对字段进行必填验证
				  username: {
				    rules:[
				      {
				        required: true,
				        errorMessage: '请输入账号',
				      }
				    ],
				  },
				  password: {
				    rules:[
				    
				      {
				        required: true,
				        errorMessage: '请输入密码',
				      }
				    ],
				  },
				}
				}
				
		},
		methods: {
			register(){
					this.$refs.formRef.validate().then(res => {					
								this.$request.post('/register',this.form).then(res => {
									if(res.code ==='200'){
										uni.showToast({
											icon:'success',
											title:'注册成功'
										})
										setTimeout(()=>{
										uni.navigateTo({
											url: '/pages/login/login'
										})
										},600)
										
									}else{
										uni.showToast({
											icon:'none',
											title: res.msg
										})
									}
								})
								}).catch(err => {
									console.log('err', err);
								})
				
			}
			
			
		}

	}
</script>

<style>

</style>
