const stripe = Stripe('pk_test_51OdYf6G6lnlAf5IPoT6FTDYhTSI1ObMODIiP3LTRDAzunS5vaK6Ilw0v7H8G1aYwhQyCINt00Dle3YkFlhy2mmZa00VgOE4Je2');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
  stripe.redirectToCheckout({
    sessionId: sessionId
  })
});