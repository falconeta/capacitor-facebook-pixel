export interface CapacitorFacebookPixelPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
