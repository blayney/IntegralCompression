Collision compression works by finding common "tokens" in text and replacing them with a smaller code.

The limitation of compression ratio with this algorithm is the effectiveness of your tokens.

It's possible to generate the ideal tokens by finding the largest, most likely tokens in the set.

The ratio between token size and probability of collision can seen as a success if it is above a certain threshold.

We can then generate a normal distribution from these ratios.

Additionally, we can incorporate speculative token generation for any text given it's approximate size using this distribution,

and then we can prove that the threshold chosen is the ideal threshold to achieve maximum compression ratios.

PDF with formula coming soooon
