package com.felinetech.localcat.utlis

data class LocalNames(
    val appName: String = "",
    val aboutAppOtherText: String = "",
    val aboutContentText: String = "",
    val aboutAppTitleText: String = "",
    val downDesktop: String = "",
    val feedBackTitle: String = "",
    val payOneYear: String = "",
    val payThreeYear: String = "",
    val registrationCode: String = "",
    val uploading: String = "",
    val history: String = "",
    val cancelTask: String = "",
    val homePageTitle: String = "",
    val upload: String = "",
    val cancelUpload: String = "",
    val serversAddress: String = "",
    val port: String = "",
    val pleaseInputIpAddress: String = "",
    val myIp: String = "",
    val connectedWifiAutoUpload: String = "",
    val privacyPolicy: String = "",
    val switchTo: String = "",
    val recipient: String = "",
    val sender: String = "",
    val searchForRecipient: String = "",
    val scanTheFile: String = "",
    val setting: String = "",
    val sendSettings: String = "",
    val addRules: String = "",
    val receiveSettings: String = "",
    val saveLocation: String = "",
    val setButton: String = "",
    val cacheSave: String = "",
    val historyRecords: String = "",
    val clearHistory: String = "",
    val paid: String = "",
    val cancel: String = "",
    val privacyPolicyPermissions: String = "",
    val doNot: String = "",
    val agree: String = "",
    val licenseExpired: String = "",
    val register: String = "",
    val cancelPay: String = "",
    val connection: String = "",
    val notConnected: String = "",
    val ruleSetting: String = "",
    val filterDirectory: String = "",
    val fileExtension: String = "",
    val afterWhatTime: String = "",
    val date: String = "",
    val time: String = "",
    val okText: String = "",
    val cancelButton: String = "",
    val edit: String = "",
    val delete: String = "",
    val licenseHasExpired: String = "",
    val registerAccording: String = "",
    val paymentOrderNumber: String = "",
    val connected: String = "",
    val downloadListRetrieved: String = "",
    val uploadListCompleted: String = "",
    val confirmationOfDeletion: String = "",
    val deleteEverything: String = "",
    val senderOfTheConnection: String = "",
    val currentlyReceivingFiles: String = "",
    val searchingInTheReceivingEnd: String = "",
    val scanningFilesToBeUploaded: String = "",
    val scanningFilesTo: String = "",
    val pleaseTurnOffTheReceivingFirst: String = "",
    val switchToSenderMode: String = "",
    val pleaseEndTheDataUploadFirst: String = "",
    val switchToReceiverMode: String = "",
    val startUploading: String = "",
    val cancelTheUpload: String = "",
    val turnOffReceiving: String = "",
    val startReceiving: String = "",
    val pleaseConnectTheReceiverFirst: String = "",
    val policyContent: String = "",
    val userAgreement: String = "",
    val privacyPolicyTitle: String = "",
    val thereAre: String = "",
    val daysLeft: String = "",
    val purchaseSucceeds: String = "",
    val network: String = "",
    val noPermission: String = "",
    val discovery: String = "",
    val unit: String = "",
    val deleteAll: String = "",
    val downloadList: String = "",
    val uploadList: String = "",
    val recipientList: String = "",
    val listToUpload: String = "",
    val listOfRules: String = "",
    val addRule: String = "",
    val homePage: String = "",
    val setPage: String = "",
    val historyPage: String = "",
    val aboutPage: String = "",
    val userIco: String = "",
    val deleteAllMsg: String = "",
    val deleteItemMsg: String = ""
)

//expect class LocalizationLoader {
expect fun getNames(language: String): LocalNames
//}