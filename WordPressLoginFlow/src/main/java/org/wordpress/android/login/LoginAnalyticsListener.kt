package org.wordpress.android.login

import java.util.Locale

interface LoginAnalyticsListener {
    fun trackAnalyticsSignIn(isWpcomLogin: Boolean)
    fun trackCreatedAccount(username: String?, email: String?, source: CreatedAccountSource)
    fun trackEmailFormViewed()
    fun trackInsertedInvalidUrl()
    fun trackLoginAccessed()
    fun trackLoginAutofillCredentialsFilled()
    fun trackLoginAutofillCredentialsUpdated()
    fun trackLoginFailed(errorContext: String?, errorType: String?, errorDescription: String?)
    fun trackLoginForgotPasswordClicked()
    fun trackLoginMagicLinkExited()
    fun trackLoginMagicLinkOpened()
    fun trackLoginMagicLinkOpenEmailClientClicked()
    fun trackLoginMagicLinkSucceeded()
    fun trackLoginSocial2faNeeded()
    fun trackLoginSocialSuccess()
    fun trackMagicLinkFailed(properties: Map<String, *>)
    fun trackSignupMagicLinkOpenEmailClientViewed()
    fun trackLoginMagicLinkOpenEmailClientViewed()
    fun trackMagicLinkRequested()
    fun trackMagicLinkRequestFormViewed()
    fun trackPasswordFormViewed(isSocialChallenge: Boolean)
    fun trackSignupCanceled()
    fun trackSignupEmailButtonTapped()
    fun trackSignupEmailToLogin()
    fun trackSignupGoogleButtonTapped()
    fun trackSignupMagicLinkFailed()
    fun trackSignupMagicLinkOpened()
    fun trackSignupMagicLinkOpenEmailClientClicked()
    fun trackSignupMagicLinkSent()
    fun trackSignupMagicLinkSucceeded()
    fun trackSignupSocialAccountsNeedConnecting()
    fun trackSignupSocialButtonFailure()
    fun trackSignupSocialToLogin()
    fun trackSignupTermsOfServiceTapped()
    fun trackSocialButtonStart()
    fun trackSocialAccountsNeedConnecting()
    fun trackSocialButtonClick()
    fun trackSocialButtonFailure()
    fun trackSocialConnectFailure()
    fun trackSocialConnectSuccess()
    fun trackSocialErrorUnknownUser()
    fun trackSocialFailure(errorContext: String?, errorType: String?, errorDescription: String?)
    fun trackTwoFactorFormViewed()
    fun trackUrlFormViewed()
    fun trackUrlHelpScreenViewed()
    fun trackUsernamePasswordFormViewed()
    fun trackWpComBackgroundServiceUpdate(properties: Map<String, *>)
    fun trackConnectedSiteInfoRequested(url: String?)
    fun trackConnectedSiteInfoFailed(url: String?, errorContext: String?, errorType: String?, errorDescription: String?)
    fun trackConnectedSiteInfoSucceeded(properties: Map<String, *>)
    fun trackFailure(message: String?)
    fun trackSendCodeWithTextClicked()
    fun trackSubmit2faCodeClicked()
    fun trackSubmitClicked()
    fun trackRequestMagicLinkClick()
    fun trackLoginWithPasswordClick()
    fun trackShowHelpClick()
    fun trackDismissDialog()
    fun trackSelectEmailField()
    fun trackPickEmailFromHint()
    fun trackShowEmailHints()
    fun emailFormScreenResumed()
    fun trackSocialSignupConfirmationViewed()
    fun trackCreateAccountClick()
    fun emailPasswordFormScreenResumed()
    fun siteAddressFormScreenResumed()
    fun magicLinkRequestScreenResumed()
    fun magicLinkSentScreenResumed()
    fun usernamePasswordScreenResumed()

    enum class CreatedAccountSource {
        EMAIL,
        GOOGLE;

        fun asPropertyMap() = hashMapOf<String, Any>(
                "source" to name.lowercase(Locale.ROOT)
        )
    }
}
